package com.example.chessinsight.chessgame.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class UserCreateDTO {
    private final String nickname;
    private final String email;
    private final String profileUrl;
}
