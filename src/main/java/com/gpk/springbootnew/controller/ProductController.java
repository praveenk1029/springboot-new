package com.gpk.springbootnew.controller;

import com.gpk.springbootnew.domain.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping(value="/getProduct", method = RequestMethod.GET)
    public String getProduct(){
        return "Tesla...";
    }

    @RequestMapping(value="/getProducts", method = RequestMethod.GET)
    public List<Product> getProducts(){
        return Arrays.asList(new Product(1, "iPhone",999.99, "Mobile"),
                new Product(2, "MacBook",2999.99, "Computer"),
                new Product(4, "Apple TV",99.99, "Accessories"),
                new Product(3, "Apple Watch",599.99, "Watch"));
    }

}
