package com.reactive.webflux1.exceptionhandler;

import com.reactive.webflux1.dto.InputFailedValidationResponse;
import com.reactive.webflux1.exception.InputValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InputValidationHandler {

    @ExceptionHandler(InputValidationException.class)
    public ResponseEntity<InputFailedValidationResponse> handleException(InputValidationException ex) {
        InputFailedValidationResponse response = new InputFailedValidationResponse();
        response.setErrorCode(ex.getErrorCode());
        response.setInput(ex.getInput());
        response.setMessage(ex.getMessage());
        return ResponseEntity.badRequest().body(response);
    }
}
