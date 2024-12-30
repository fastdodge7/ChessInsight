package com.example.chessinsight.chessgame.converter;

import com.example.chessinsight.chessgame.domain.entity.User;
import com.example.chessinsight.chessgame.dto.UserCreateDTO;
import com.example.chessinsight.chessgame.dto.UserDTO;

public class UserConverter {
    public static UserDTO convertToDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .profileUrl(user.getProfileUrl())
                .email(user.getEmail())
                .nickname(user.getNickname())
                .build();
    }

    public static User convertToEntity(UserCreateDTO userDTO) {
        return User.builder()
                .nickname(userDTO.getNickname())
                .email(userDTO.getEmail())
                .profileUrl(userDTO.getProfileUrl())
                .build();
    }
}

