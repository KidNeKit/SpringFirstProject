package com.mercury.demo.repo;

import com.mercury.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {        //long - тип данных id
}
