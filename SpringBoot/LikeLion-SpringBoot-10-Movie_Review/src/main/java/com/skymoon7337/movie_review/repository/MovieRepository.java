package com.skymoon7337.movie_review.repository;

import com.skymoon7337.movie_review.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
