package com.skymoon7337.simple_board.repository;

import com.skymoon7337.simple_board.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}