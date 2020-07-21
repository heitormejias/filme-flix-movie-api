package br.com.klauddius.filmeflix.movie.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Movie {

    @Id
    @GeneratedValue
    public Long id;

    public String title;

    public LocalDate releaseDate;

    public String originalTitle;

    public String synopsis;

    public LocalDateTime creationDate = LocalDateTime.now();
}
