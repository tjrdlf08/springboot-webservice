package com.han.proj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {                          // 머스테치 스타터로 인해 문자열 반환시 앞의 경로, 뒤의 파일 확장자는 자동지정

    @GetMapping("/")
    public String index() {
        return "index";             // ==> src/main/resources/templates/index.mustache
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}