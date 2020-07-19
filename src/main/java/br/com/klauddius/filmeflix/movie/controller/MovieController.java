package br.com.klauddius.filmeflix.movie.controller;

import br.com.klauddius.filmeflix.movie.entity.Movie;
import br.com.klauddius.filmeflix.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return repository.findAll();
    }

    @GetMapping("/all/recently")
    public List<Movie> getAllMoviesRecentlyAdded() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "releaseDate"));
    }

    @PostMapping("/add")
    public void addMovie(@RequestBody Movie movie) {
        repository.save(movie);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
