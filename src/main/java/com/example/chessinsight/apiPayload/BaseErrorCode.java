package com.example.chessinsight.apiPayload;

import com.example.chessinsight.apiPayload.code.ErrorStatusDTO;

public interface BaseErrorCode {
    public ErrorStatusDTO getErrorStatus();
    public ErrorStatusDTO getErrorStatusWithHttpStatus();
}
