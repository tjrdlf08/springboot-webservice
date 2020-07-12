package com.han.proj.web;

import com.han.proj.config.auth.LoginUser;
import com.han.proj.config.auth.dto.SessionUser;
import com.han.proj.service.posts.PostsService;
import com.han.proj.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {                          // 머스테치 스타터로 인해 문자열 반환시 앞의 경로, 뒤의 파일 확장자는 자동지정
    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        model.addAttribute("posts", postsService.findAllDesc());

        if(user != null)  { model.addAttribute("userName", user.getName()); }

        return "index";                                 // ==> src/main/resources/templates/index.mustache
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}