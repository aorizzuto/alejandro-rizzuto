package com.xcale.challenge.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseEntityBody {

    private String message;
    private String errorCode;

    public ResponseEntityBody(String message, @JsonProperty("error_code") String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public ResponseEntityBody(String message){
        this.message = message;
        this.errorCode = "400";
    }
}
