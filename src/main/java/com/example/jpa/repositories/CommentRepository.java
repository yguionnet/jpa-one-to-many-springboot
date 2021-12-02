package com.example.jpa.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	Optional<Comment> findByIdAndPostId(Long id, Long postId);
	
	Page<Comment> findByPostId(Long postId, Pageable pageable);
}
