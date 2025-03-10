package com.example.demo.post.controller.port;

import com.example.demo.post.domain.Post;
import com.example.demo.post.domain.PostCreate;
import com.example.demo.post.domain.PostUpdate;

public interface PostService {

    Post create(PostCreate postCreate);

    Post update(long id, PostUpdate postUpdate);

    Post getById(long id);
}
