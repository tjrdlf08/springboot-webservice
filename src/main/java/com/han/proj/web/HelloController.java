package com.han.proj.web;

import com.han.proj.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto hellodto(@RequestParam("name") String name, @RequestParam("amount") int amount) {

        return new HelloResponseDto(name, amount);
    }       //  외부 API로 넘긴 파라미터를 가져오는 어노테이션. / 외부서 name으로 넘긴 파라미터를 메소트 파라미터 name에 저장!
}