package com.example.chessinsight.chessgame.dto;


import com.example.chessinsight.chessgame.domain.entity.User;
import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class UserDTO {

    UserDTO(User userObj) {
        id = userObj.getId();
        nickname = userObj.getNickname();
        profileUrl = userObj.getProfileUrl();
        email = userObj.getEmail();
    }

    private final long id;

    private final String nickname;

    private final String profileUrl;

    private final String email;
}
