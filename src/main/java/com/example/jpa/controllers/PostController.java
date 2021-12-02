package com.example.jpa.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.model.Post;
import com.example.jpa.repositories.PostRepository;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
    private PostRepository postRepository;
	
	@GetMapping
    public Page<Post> getAllPosts(Pageable pageable) {
        return postRepository.findAll(pageable);
    }
	
	@PostMapping
    public Post createPost(@Valid @RequestBody Post post) {
        return postRepository.save(post);
    }
	
	
}
