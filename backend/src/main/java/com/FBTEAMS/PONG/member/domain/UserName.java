package com.FBTEAMS.PONG.member.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class UserName {

    private final int MIN_LENGTH = 1;
    private final int MAX_LENGTH = 20;
}
