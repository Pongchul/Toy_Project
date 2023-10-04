package com.FBTEAMS.PONG.member.service;

import com.FBTEAMS.PONG.member.domain.*;
import com.FBTEAMS.PONG.member.dto.request.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;

    @Transactional
    public Long signUp(SignupRequest request) {
        UserId userId = UserId.from(request.getUserId());
        Password password = Password.encrypt(request.getPassword(), passwordEncoder);
        UserName userName = UserName.from(request.getUserName());

        Member member = new Member(userId, password, userName);
        Member savedMember = memberRepository.save(member);

        return savedMember.getId();
    }

}
