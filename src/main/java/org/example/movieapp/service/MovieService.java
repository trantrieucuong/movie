package org.example.movieapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.example.movieapp.entity.Movie;
import org.example.movieapp.repository.MovieRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll(Sort.by("createdAt").descending());
    }

    public Movie getMovieById(Integer id) {
        return movieRepository.findById(id).orElse(null);
    }
}
