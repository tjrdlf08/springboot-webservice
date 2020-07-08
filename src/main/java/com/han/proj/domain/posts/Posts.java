package com.han.proj.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@Entity  // JPA의 annotation, 테이블과 링크될 클래스임을 명시
public class Posts extends BaseTimeEntity{      // BaseTimeEntity를 상속받음으로써 앞으로 추가, 수정될 entity의 등록,수정시간 고민할 필요없음

    @Id  // 해당 table의 Primary Key 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}


// entity class