package com.example.springsecurity.ApiResponse;

import javax.management.RuntimeErrorException;

public class ApiException extends RuntimeException {


    public ApiException(String message){
        super(message);
    }
}
