package org.example.movieapp.service;

import lombok.RequiredArgsConstructor;

import org.example.movieapp.entity.Actor;
import org.example.movieapp.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {
    private final ActorRepository actorRepository;

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }
}
