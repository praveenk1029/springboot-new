package com.gpk.springbootnew.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class OrderController {
    @RequestMapping(value="/getOrder", method = RequestMethod.GET)
    public String getOrder(){
        return "Order# 2482...";
    }
}
