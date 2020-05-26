package com.myTest.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myTest.domain.PostsMainResponseDto;
import com.myTest.domain.PostsRepository;
import com.myTest.domain.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostService {
	
	private PostsRepository postsRepository;
	
	@Transactional
	public long save(PostsSaveRequestDto dto) {
		
		return postsRepository.save(dto.toEntity()).getId();
		
	}
	@Transactional(readOnly = true)
	public List<PostsMainResponseDto> findAllDesc(){
		
		return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
		
	}
}
