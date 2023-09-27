package com.FBTEAMS.PONG.member.exception;

import com.FBTEAMS.PONG.global.exception.CustomErrorCode;

public enum MemberErrorCode implements CustomErrorCode {

    PASSWORD_IS_NOT_WRONG_RANGE(400, "MEBMER_001", "올바르지 않는 비밀번호 길이입니다."),
    PASSWORD_IS_NOT_COLLECT_PATTERN(400,"MEMBER_001","올바르지 않는 비밀번호 패턴입니다."),

    USERID_IS_NOT_WRONG_RANGE(400, "MEMBER_003", "올바르지 않는 아이디 길이입니다."),
    USERID_IS_NOT_COLLECT_PATTERN(400, "MEMBER_004", "올바르지 않는 아이디 패턴입니다."),

    USERNAME_IS_NOT_COLLECT_PATTERN(400, "MEMBER_005", "올바르지 않는 닉네임입니다."),

    ;

    private final int statusCode;
    private final String errorCode;
    private final String message;

    MemberErrorCode(int statusCode, String errorCode, String message) {
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.message = message;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
