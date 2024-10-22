package org.example.movieapp.rest;

import lombok.RequiredArgsConstructor;

import org.example.movieapp.entity.Director;
import org.example.movieapp.model.request.UpsertDirectorRequest;
import org.example.movieapp.service.DirectorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/directors")
@RequiredArgsConstructor
public class DirectorResource {
    private final DirectorService directorService;

    @PostMapping
    public ResponseEntity<?> createDirector(@RequestBody UpsertDirectorRequest request) {
        Director director = directorService.createDirector(request);
        return ResponseEntity.ok(director); // status code 200
    }
}
