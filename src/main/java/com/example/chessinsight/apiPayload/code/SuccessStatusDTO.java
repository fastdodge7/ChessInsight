package com.example.chessinsight.apiPayload.code;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@RequiredArgsConstructor
public class SuccessStatusDTO {

    private final HttpStatus status;
    private final String message;
    private final String code;
    private final boolean isSuccess;

}
