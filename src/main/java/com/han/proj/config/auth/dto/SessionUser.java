package com.han.proj.config.auth.dto;

import com.han.proj.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}

// 인증된 사용자 정보만 필요 == > name, email, picture만 필드로 선언함