package com.springboot.restfulboard.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> { // JpaRepository<Entity 클래스, PK타입>

}
