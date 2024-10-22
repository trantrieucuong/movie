package org.example.movieapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.example.movieapp.entity.Director;
import org.example.movieapp.model.request.UpsertDirectorRequest;
import org.example.movieapp.repository.DirectorRepository;
import org.example.movieapp.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DirectorService {
    private final DirectorRepository directorRepository;

    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    public Director createDirector(UpsertDirectorRequest request) {
        Director director = Director.builder()
                .name(request.getName())
                .description(request.getDescription())
                .birthday(request.getBirthday())
                .avatar(StringUtils.generateLinkImage(request.getName()))
                .build();

        return directorRepository.save(director);
    }
}
