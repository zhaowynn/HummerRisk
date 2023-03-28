package com.hummer.cloud.controller.handler;


import com.hummer.common.core.exception.HRException;
import com.hummer.common.core.handler.ResultHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@RestControllerAdvice
public class RestControllerExceptionHandler {

    @ExceptionHandler(HRException.class)
    public ResultHolder exceptionHandler(HttpServletRequest request, HttpServletResponse response, HRException e) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResultHolder.error(e.getMessage());
    }
}
