package com.gpk.springbootnew.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrderController {
    @RequestMapping(value="/getOrder", method = RequestMethod.GET)
    public List<String> getOrder(){
        List<String> orders = Arrays.asList("Electronics", "Office Supplies", "Toys");
        orders.stream().forEach(System.out::println);
        return orders.stream().collect(Collectors.toList());
    }
}
