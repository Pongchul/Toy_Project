package com.FBTEAMS.backend.global.exception;

public interface CustomErrorCode {

    int getStatusCode();

    String getErrorCode();

    String getMessage();
}
