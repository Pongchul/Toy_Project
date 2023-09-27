package com.FBTEAMS.PONG.member.controller;

import com.FBTEAMS.PONG.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;



}
