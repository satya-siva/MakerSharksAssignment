package com.example.MakerSharks.exception;


import org.springframework.http.HttpStatus;

public class MakerSharksApiException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;

    public MakerSharksApiException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
