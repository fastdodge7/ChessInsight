package com.example.chessinsight.apiPayload;

import com.example.chessinsight.apiPayload.code.ErrorStatusDTO;
import com.example.chessinsight.apiPayload.code.SuccessStatusDTO;

public interface BaseCode {
    public SuccessStatusDTO getStatus();
    public SuccessStatusDTO getStatusWithHttpStatus();
}
