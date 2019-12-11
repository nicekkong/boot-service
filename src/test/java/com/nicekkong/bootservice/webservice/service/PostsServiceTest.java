package com.nicekkong.bootservice.webservice.service;

import com.nicekkong.bootservice.webservice.dto.PostsSaveRequestDto;
import com.nicekkong.bootservice.webservice.domain.Posts;
import com.nicekkong.bootservice.webservice.domain.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsServiceTest {

    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void testSave() {
        // given
        PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
                .author("nicekkong@gmail.com")
                .content("First Contents for test")
                .title("Test Title").build();

        // when
        postsService.save(dto);

        // then
        Posts post = postsRepository.findAll().get(0);
        assertThat(post.getAuthor()).isEqualTo(dto.getAuthor());
        assertThat(post.getContent()).isEqualTo(dto.getContent());
        assertThat(post.getTitle()).isEqualTo(dto.getTitle());
    }
}