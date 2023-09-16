package com.FBTEAMS.PONG;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/hello")
    public List<String> hello() {
        return Arrays.asList("백엔드에서 가져온", "데이터 입니다.");
    }
}
