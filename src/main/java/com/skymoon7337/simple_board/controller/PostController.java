package com.skymoon7337.simple_board.controller;


import com.skymoon7337.simple_board.dto.PostDto;
import com.skymoon7337.simple_board.model.Post;
import com.skymoon7337.simple_board.model.User;
import com.skymoon7337.simple_board.repository.CommentRepository;
import com.skymoon7337.simple_board.repository.PostRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    private User currentUser(HttpSession httpSession) {
        return (User) httpSession.getAttribute("user");
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("posts", postRepository.findAll());

        return "post-list";
    }

    @GetMapping("/add")
    public String addForm(Model model, HttpSession httpSession) {
        if (currentUser(httpSession) == null) return "redirect:/login";

        model.addAttribute("postDto", new PostDto());

        return "post-form";
    }

    @PostMapping("/add")
    public String add(
            @Valid @ModelAttribute PostDto postDto,
            BindingResult bindingResult,
            HttpSession httpSession
    ) {
        if (bindingResult.hasErrors()) return "post-form";

        User user = currentUser(httpSession);
        Post post = Post.builder()
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .author(user)
                .createdAt(LocalDateTime.now())
                .build();

        postRepository.save(post);

        return "redirect:/posts";
    }
}