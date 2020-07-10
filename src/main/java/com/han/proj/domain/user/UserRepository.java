package com.han.proj.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);                   // 소셜 로그인 반환 email값을 통해 이미 가입된 사용자 여부 판단
}
