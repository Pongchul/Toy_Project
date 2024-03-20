package com.FBTEAMS.backend.global.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    private final int statusCode;
    private final String errorCode;
    private final String message;

    public CustomException(CustomErrorCode code) {
        statusCode = code.getStatusCode();
        errorCode = code.getErrorCode();
        message = code.getMessage();
    }
}
