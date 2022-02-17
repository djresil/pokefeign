package com.pokefeignapi.pokefeign.controller;

import com.pokefeignapi.pokefeign.exception.ApiError;
import com.pokefeignapi.pokefeign.exception.NotFoundNameException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ControllerHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {NotFoundNameException.class})
    public ResponseEntity<ApiError> handleNotFoundNameException(NotFoundNameException e){
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        ApiError apiError = new ApiError(
                "Nombre de monstruo no encontrado",
                httpStatus
        );
        return new ResponseEntity<>(apiError, httpStatus);
        }
}
