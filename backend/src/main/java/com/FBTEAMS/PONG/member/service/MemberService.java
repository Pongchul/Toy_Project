package com.FBTEAMS.PONG.member.service;

import com.FBTEAMS.PONG.member.domain.*;
import com.FBTEAMS.PONG.member.dto.request.SignupRequest;
import com.FBTEAMS.PONG.member.exception.MemberErrorCode;
import com.FBTEAMS.PONG.member.exception.MemberException;
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

    private void validateUserIdIsNotDuplicated(UserId userId) {
        if (memberRepository.existsByUserId(userId)) {
            // TODO : 에러 코드 추가 필요
            throw new MemberException(MemberErrorCode.USERID_IS_NOT_WRONG_RANGE);
        }
    }

}
