package com.gpk.springbootnew.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping(value="/getProduct", method = RequestMethod.GET)
    public String getProduct(){
        return "Tesla...";
    }
}
