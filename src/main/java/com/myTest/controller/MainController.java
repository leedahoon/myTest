package com.myTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myTest.service.PostService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MainController {
	
	private PostService postService;
	
	@GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postService.findAllDesc());
        return "login";
    }
}
