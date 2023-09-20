package com.FBTEAMS.PONG.member.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class Password {

    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 30;
    private static final String PASSWORD_FORMAT = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$";

    @Column(name = "password")
    private String value;

    public Password(String value) {
        this.value = value;
    }


}
