package com.FBTEAMS.backend.member.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {

    @NotNull
    private String userId;

    @NotNull
    private String password;

    @NotNull
    private String userName;

}
