package com.pokefeignapi.pokefeign.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {

        switch (response.status()) {
            case 404:
                return new NotFoundNameException();
            default:
                return new Exception();
        }
    }
}
