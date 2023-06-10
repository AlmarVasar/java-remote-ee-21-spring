package com.sda.javaremoteee21spring.controller.web;


import com.sda.javaremoteee21spring.exception.CarNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice("com.sda.javaremoteee21spring.controller.web")
public class CarWebAdvisor {

    @ExceptionHandler(RuntimeException.class)
    public String notFoundPage() {
        return "errors/wrong-request";

    }
}
