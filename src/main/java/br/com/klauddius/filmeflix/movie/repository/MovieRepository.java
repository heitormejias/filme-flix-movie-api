package br.com.klauddius.filmeflix.movie.repository;

import br.com.klauddius.filmeflix.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {



}
