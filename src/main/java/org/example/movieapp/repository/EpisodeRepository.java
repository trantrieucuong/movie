package org.example.movieapp.repository;


import org.example.movieapp.entity.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EpisodeRepository extends JpaRepository<Episode, Integer> {
    List<Episode> findByMovie_IdOrderByDisplayOrderAsc(Integer movieId);

    List<Episode> findByMovie_IdAndStatusOrderByDisplayOrderAsc(Integer movieId, Boolean status);

    Optional<Episode> findByMovie_IdAndDisplayOrderAndStatus(Integer movieId, Integer displayOrder, Boolean status);
}