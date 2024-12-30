package com.example.chessinsight.apiPayload.code;

import com.example.chessinsight.apiPayload.BaseCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@Getter
@RequiredArgsConstructor
public enum SuccessStatus implements BaseCode {

    _OK(HttpStatus.OK, true, "200", "200 : 접속 성공");


    private final HttpStatus status;
    private final boolean isSuccess;
    private final String code;
    private final String message;

    @Override
    public SuccessStatusDTO getStatus() {
        return SuccessStatusDTO.builder()
                .isSuccess(this.isSuccess)
                .code(this.code)
                .message(this.message)
                .build();
    }

    @Override
    public SuccessStatusDTO getStatusWithHttpStatus() {
        return SuccessStatusDTO.builder()
                .status(this.status)
                .isSuccess(this.isSuccess)
                .code(this.code)
                .message(this.message)
                .build();
    }
}
