package org.example.movieapp.service;

import lombok.RequiredArgsConstructor;

import org.example.movieapp.entity.Genre;
import org.example.movieapp.repository.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreService {
    private final GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}
