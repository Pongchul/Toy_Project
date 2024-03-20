package com.FBTEAMS.backend.member.controller;

import com.FBTEAMS.backend.member.dto.request.SignupRequest;
import com.FBTEAMS.backend.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<Void> signUp(@RequestBody SignupRequest request) {
        memberService.signUp(request);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
