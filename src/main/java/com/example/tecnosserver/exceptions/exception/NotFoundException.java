package com.example.tecnosserver.exceptions.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends AppException {
    public NotFoundException(String message) {
        super(message);
    }
}
