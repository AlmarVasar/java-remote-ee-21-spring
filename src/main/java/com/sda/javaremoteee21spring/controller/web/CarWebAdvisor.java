package com.sda.javaremoteee21spring.controller.web;


import com.sda.javaremoteee21spring.exception.CarNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CarWebAdvisor {

    @ExceptionHandler(CarNotFoundException.class)
    public String notFoundPage() {
        return "not-found";


    }
}
