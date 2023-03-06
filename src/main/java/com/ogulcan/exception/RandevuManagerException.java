package com.ogulcan.exception;

import lombok.Getter;

@Getter
public class RandevuManagerException extends RuntimeException{
    private final EErrorType errorType;

    public RandevuManagerException(EErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public RandevuManagerException(EErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}
