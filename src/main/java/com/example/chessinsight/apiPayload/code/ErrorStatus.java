package com.example.chessinsight.apiPayload.code;


import com.example.chessinsight.apiPayload.BaseCode;
import com.example.chessinsight.apiPayload.BaseErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorStatus implements BaseErrorCode {

    _BAD_REQUEST(HttpStatus.BAD_REQUEST, false, "COMMON400 : Bad Request", "잘못된 요청입니다."),
    _UNAUTHORIZED(HttpStatus.UNAUTHORIZED, false, "COMMON401 : Unauthorized", "인증이 필요합니다."),
    _FORBIDDEN(HttpStatus.FORBIDDEN, false, "COMMON403 : Forbidden", "금지된 요청입니다."),
    _INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, false, "COMMON500 : Internal Server Error", "서버 오류입니다. 관리자에게 문의해 주세요.");

    private final HttpStatus httpStatus;
    private final boolean isSuccess;
    private final String code;
    private final String message;

    @Override
    public ErrorStatusDTO getErrorStatus() {
        return ErrorStatusDTO.builder()
                .isSuccess(this.isSuccess)
                .code(this.code)
                .message(this.message)
                .build();
    }

    @Override
    public ErrorStatusDTO getErrorStatusWithHttpStatus() {
        return ErrorStatusDTO.builder()
                .status(this.httpStatus)
                .isSuccess(this.isSuccess)
                .code(this.code)
                .message(this.message)
                .build();
    }
}
