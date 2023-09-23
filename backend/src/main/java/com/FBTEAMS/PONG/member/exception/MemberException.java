package com.FBTEAMS.PONG.member.exception;

import com.FBTEAMS.PONG.global.exception.CustomErrorCode;
import com.FBTEAMS.PONG.global.exception.CustomException;

public class MemberException extends CustomException {
    public MemberException(CustomErrorCode code) {
        super(code);
    }
}
