package com.myTest.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.myTest.domain.PostsSaveRequestDto;
import com.myTest.service.PostService;

import lombok.AllArgsConstructor;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
	
	private PostService postService;
	
	@PostMapping("/post")
	public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
		return postService.save(dto);
	}
	
}
