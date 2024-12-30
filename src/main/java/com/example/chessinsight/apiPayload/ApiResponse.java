package com.example.chessinsight.apiPayload;

import com.example.chessinsight.apiPayload.code.SuccessStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "code", "message", "result"})
public class ApiResponse<T> {

    @JsonProperty("isSuccess")
    private boolean isSuccess;

    private String code;

    private String message;

    private T result;

    public static <T> ApiResponse<T> onSuccess(T data) {
        return new ApiResponse<>(SuccessStatus._OK.isSuccess(), SuccessStatus._OK.getCode(), SuccessStatus._OK.getMessage(), data);
    }

    public static <T> ApiResponse<T> of(BaseCode code, T data) {
        return new ApiResponse<>(true, code.getStatus().getCode(), code.getStatus().getMessage(), data);
    }

    public static <T> ApiResponse<T> onFailure(BaseErrorCode errorCode, T data) {
        return new ApiResponse<>(false, errorCode.getErrorStatus().getCode(), errorCode.getErrorStatus().getMessage(), data);
    }
}
