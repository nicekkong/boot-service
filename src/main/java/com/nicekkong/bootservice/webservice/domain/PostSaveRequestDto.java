package com.nicekkong.bootservice.webservice.domain;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class PostSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public Posts toEntity() {
        return Posts.builder().title(this.title)
                            .content(this.content)
                            .author(this.author)
                        .build();
    }
}
