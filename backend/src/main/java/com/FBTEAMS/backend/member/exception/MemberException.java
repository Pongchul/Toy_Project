package com.FBTEAMS.backend.member.exception;

import com.FBTEAMS.backend.global.exception.CustomErrorCode;
import com.FBTEAMS.backend.global.exception.CustomException;

public class MemberException extends CustomException {
    public MemberException(CustomErrorCode code) {
        super(code);
    }
}
