package com.yc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExceptionHandle implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println(ex.getMessage());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errMsg",ex.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
