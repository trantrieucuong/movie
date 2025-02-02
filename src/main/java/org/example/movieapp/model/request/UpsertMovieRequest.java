package org.example.movieapp.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import org.example.movieapp.model.enums.MovieType;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpsertMovieRequest {
    String title;
    String description;
    Boolean status;
    MovieType type;
    Integer releaseYear;
    List<Integer> directorIds;
    List<Integer> actorIds;
    List<Integer> genreIds;
}
