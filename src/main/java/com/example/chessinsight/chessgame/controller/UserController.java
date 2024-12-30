package com.example.chessinsight.chessgame.controller;

import com.example.chessinsight.apiPayload.ApiResponse;
import com.example.chessinsight.chessgame.converter.UserConverter;
import com.example.chessinsight.chessgame.domain.entity.User;
import com.example.chessinsight.chessgame.dto.UserCreateDTO;
import com.example.chessinsight.chessgame.dto.UserDTO;
import com.example.chessinsight.chessgame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user")
    public ApiResponse<UserDTO> createUser(@RequestBody UserCreateDTO userData) {
        User newUser = UserConverter.convertToEntity(userData);
        userService.saveUser(newUser);
        return ApiResponse.onSuccess(UserConverter.convertToDTO(newUser));
    }

    @GetMapping("/user/{id}")
    public ApiResponse<UserDTO> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        User target= user.orElseThrow(() -> new NoSuchElementException("User with id " + id + " not found"));
        return ApiResponse.onSuccess(UserConverter.convertToDTO(target));
    }

    @DeleteMapping("/user/{id}")
    public ApiResponse<Long> deleteUser(@PathVariable Long id) {
        userService.softDeleteUser(id);
        return ApiResponse.onSuccess(id);
    }
}
