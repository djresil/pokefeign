package com.pokefeignapi.pokefeign.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class ApiError {

    private final String message;
    private  final HttpStatus httpStatus;

}
