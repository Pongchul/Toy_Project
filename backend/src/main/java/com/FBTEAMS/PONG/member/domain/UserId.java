package com.FBTEAMS.PONG.member.domain;

import com.FBTEAMS.PONG.member.exception.MemberErrorCode;
import com.FBTEAMS.PONG.member.exception.MemberException;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
public class UserId {

    // TODO: 유저 아이디 생성 규칙 -> 6자 30자 이하 여야 하며, 이메일 포멧이어야 한다.


    private static final int MIN_LENGTH = 6;
    private static final int MAX_LENGTH = 20;
    private static final String EMAIL_FORMAT = "@";

    @Column(name = "user_id", unique = true)
    private String value;

    public UserId(String value) {
        this.value = value;
    }

    // Method from -> 매개변수를 하나 받아서 해당 타입의 인스턴스를 빈환하는 형변환 메서드 (Effective Java)
    public static UserId from(String value) {
        wrongUserIdFormat(value);
        validLengthInRange(value);

        return new UserId(value);
    }

    private static void validLengthInRange(String value) {
        int length = value.length();
        if (length < MIN_LENGTH || length > MAX_LENGTH) {
            throw new MemberException(MemberErrorCode.USERID_IS_NOT_WRONG_RANGE);
        }
    }

    private static void wrongUserIdFormat(String value) {
        if (!value.contains(EMAIL_FORMAT)) {
            throw new MemberException(MemberErrorCode.USERID_IS_NOT_COLLECT_PATTERN);
        }
    }
}
