package com.example.chessinsight.chessgame.dto;


import com.example.chessinsight.chessgame.domain.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@RequiredArgsConstructor
@Builder
@Getter
public class UserDTO {

    @NotBlank(message = "id 정보는 필수입니다.")
    private final long id;

    @NotBlank(message = "닉네임 정보는 필수입니다.")
    private final String nickname;

    private final String profileUrl;

    @NotBlank(message = "이메일 정보는 필수입니다.")
    @Email(message = "이메일 정보가 이메일 형식이 아닙니다.")
    private final String email;
}
