package com.sylph.ex.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // 인터페이스 생성후 JpaRepository<Entity클래스, PK 타입>를 상속하면 기본적인 CRUD메소드가 자동으로 생성

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
