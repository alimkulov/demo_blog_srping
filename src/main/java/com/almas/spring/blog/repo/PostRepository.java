package com.almas.spring.blog.repo;

import com.almas.spring.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
