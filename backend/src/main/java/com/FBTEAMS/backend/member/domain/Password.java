package com.FBTEAMS.backend.member.domain;

import com.FBTEAMS.backend.member.exception.MemberException;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.regex.Pattern;

import static com.FBTEAMS.backend.member.exception.MemberErrorCode.*;

@Embeddable
@NoArgsConstructor
@Getter
public class Password {

    /**
     * 비밀번호 생성 규칙
     * -> 비밀번호는 8자이상 15자 이하여야 하며 대소문자 포함 영문자와 숫자, 특수문자를 하나 이상 포함해야 한다.
     */

    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 15;
    private static final String PASSWORD_FORMAT = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_FORMAT);

    @Column(name = "password")
    private String value;

    public Password(String value) {
        this.value = value;
    }

    public static Password encrypt(String value, PasswordEncoder encoder) {
        validPatternIsValid(value);
        validLengthInRange(value);
        return new Password(encoder.encode(value));
    }

    public Password update(String value, PasswordEncoder encoder) {
        return Password.encrypt(value, encoder);
    }

    private static void validLengthInRange(String password) {
        int length = password.length();
        if (length < MIN_LENGTH || length > MAX_LENGTH) {
            throw new MemberException(PASSWORD_IS_NOT_WRONG_RANGE);
        }
    }

    private boolean isSame(String password) {
        return value.equals(password);
    }

    private static boolean isNotValid(String value) {
        return !PASSWORD_PATTERN.matcher(value).matches();
    }

    private static void validPatternIsValid(String value) {
        if (isNotValid(value)) {
            throw new MemberException(PASSWORD_IS_NOT_COLLECT_PATTERN);
        }
    }

}
