package com.FBTEAMS.PONG.member.domain;

import com.FBTEAMS.PONG.member.exception.MemberException;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import static com.FBTEAMS.PONG.member.exception.MemberErrorCode.*;

@Embeddable
@NoArgsConstructor
public class UserName {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 20;

    @Column(name = "user_name", unique = true)
    private String value;

    public UserName(String value) {
        this.value = value;
    }

    public static UserName from(String value) {
        validLengthInRange(value);
        return new UserName(value);
    }

    public UserName update(String value) {
        return UserName.from(value);
    }

    private static void validLengthInRange(String value) {
        int length = value.length();
        if (length < MIN_LENGTH || length > MAX_LENGTH) {
            throw new MemberException(USERNAME_IS_NOT_COLLECT_PATTERN);
        }
    }
}
