package br.com.klauddius.filmeflix.movie.controller;

import br.com.klauddius.filmeflix.movie.entity.Movie;
import br.com.klauddius.filmeflix.movie.exception.MovieNotFoundException;
import br.com.klauddius.filmeflix.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @GetMapping("/movie/")
    public List<Movie> getAllMovies() {
        return repository.findAll();
    }

    @GetMapping("/movie/recently")
    public List<Movie> getAllMoviesRecentlyAdded() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "creationDate"));
    }

    @PostMapping("/movie/")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMovie(@RequestBody Movie movie) {
        repository.save(movie);
    }

    @DeleteMapping("/movie/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteMovie(@PathVariable Long id) {
        Optional<Movie> movieToExclude = repository.findById(id);
        if (!movieToExclude.isPresent()) {
            throw new MovieNotFoundException();
        }
        repository.deleteById(id);
    }

}
