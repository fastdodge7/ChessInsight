package com.example.chessinsight.chessgame.dto;


import com.example.chessinsight.chessgame.domain.entity.User;
import lombok.*;

@RequiredArgsConstructor
@Builder
@Getter
public class UserDTO {

    private final long id;

    private final String nickname;

    private final String profileUrl;

    private final String email;
}
