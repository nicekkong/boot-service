package com.nicekkong.bootservice.webservice.dto;

import com.nicekkong.bootservice.webservice.domain.Posts;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class PostsMainResponseDto {

    private Long id;
    private String title;
    private String author;
    private String content;
    private String updDate;

    public PostsMainResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.content = entity.getContent();
        this.updDate = toStringDateTime(entity.getUpdDate());
    }

    private String toStringDateTime(LocalDateTime updDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(updDate)
                .map(formatter::format).orElse("");
    }

}
