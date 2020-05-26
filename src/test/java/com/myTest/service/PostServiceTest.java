package com.myTest.service;

import org.aspectj.lang.annotation.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.myTest.domain.Posts;
import com.myTest.domain.PostsRepository;
import com.myTest.domain.PostsSaveRequestDto;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {
	
	@Autowired
	private PostService postsService;
	
	@Autowired
	private PostsRepository postsRepository;
	
	@After(value = "")
	public void cleanup() {
		postsRepository.deleteAll();
	}
	
	@Test
	public void dto�����Ͱ�_posts���̺�_����ȴ�() {
		//given
        PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
                .author("jojoldu@gmail.com")
                .content("�׽�Ʈ")
                .title("�׽�Ʈ Ÿ��Ʋ")
                .build();

        //when
        postsService.save(dto);

        //then
        Posts posts = postsRepository.findAll().get(0);
        assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
        assertThat(posts.getContent()).isEqualTo(dto.getContent());
        assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
		
	}
}
