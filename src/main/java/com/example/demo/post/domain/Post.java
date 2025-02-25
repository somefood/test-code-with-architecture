package com.example.demo.post.domain;

import com.example.demo.common.service.port.ClockHolder;
import com.example.demo.user.domain.User;
import lombok.Builder;
import lombok.Getter;

import java.time.Clock;

@Getter
public class Post {

    private final Long id;
    private final String content;
    private final Long createdAt;
    private final Long modifiedAt;
    private final User writer;

    @Builder
    public Post(Long id, String content, Long createdAt, Long modifiedAt, User writer) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.writer = writer;
    }

    public static Post from(User user, PostCreate postCreate, ClockHolder clockHolder) {
        return Post.builder()
                .writer(user)
                .content(postCreate.getContent())
                .createdAt(clockHolder.millis())
                .build();
    }


    public Post update(PostUpdate postUpdate, ClockHolder clockHolder) {
        return Post.builder()
                .id(id)
                .content(postUpdate.getContent())
                .createdAt(createdAt)
                .modifiedAt(clockHolder.millis())
                .writer(writer)
                .build();
    }
}
