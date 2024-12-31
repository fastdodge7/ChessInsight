package com.example.chessinsight.chessgame.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class UserCreateDTO {

    @NotBlank(message = "닉네임 정보는 필수입니다.")
    private final String nickname;

    @NotBlank(message = "이메일 정보는 필수입니다.")
    @Email(message = "이메일 정보가 이메일 형식이 아닙니다.")
    private final String email;

    private final String profileUrl;
}
