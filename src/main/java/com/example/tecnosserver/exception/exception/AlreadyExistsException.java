package com.example.tecnosserver.exception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AlreadyExistsException extends AppException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}