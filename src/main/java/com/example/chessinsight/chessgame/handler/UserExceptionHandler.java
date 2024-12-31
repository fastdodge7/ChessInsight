package com.example.chessinsight.chessgame.handler;

import com.example.chessinsight.apiPayload.ApiResponse;
import com.example.chessinsight.apiPayload.code.ErrorStatus;
import com.example.chessinsight.apiPayload.code.ErrorStatusDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice(basePackages = "com.example.chessinsight.chessgame.controlle")
public class UserExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    protected ApiResponse<String> handleNoSuchElementException(NoSuchElementException e) {
        return ApiResponse.onFailure(ErrorStatus._NOT_FOUND, e.getMessage());

    }
}
