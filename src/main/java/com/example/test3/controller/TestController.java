package com.example.test3.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{

    @Autowired
    HttpServletRequest request;


    @GetMapping("test")
    public String get(){
        return "hello world";
    }
} 