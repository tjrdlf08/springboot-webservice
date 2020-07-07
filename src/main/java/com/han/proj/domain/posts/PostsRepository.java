package com.han.proj.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> { // 상속으로 기본 CRUD 메소드가 자동 생성


}


// DAO