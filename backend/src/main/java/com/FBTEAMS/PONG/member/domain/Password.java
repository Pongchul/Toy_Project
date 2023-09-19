package com.FBTEAMS.PONG.member.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Password {

    private final int MIN_LENGTH = 8;
    private final int MAX_LENGTH = 30;
}
