package com.gpk.springbootnew.controller;
import com.gpk.springbootnew.domain.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    public static final String ACCESSORIES1 = "Accessories";
    public static final String ACCESSORIES = "Accessories";

    @RequestMapping(value="/getProduct", method = RequestMethod.GET)
    public String getProduct(){
        return "Tesla...";
    }

    @RequestMapping(value="/getProducts", method = RequestMethod.GET)
    public List<Product> getProducts(){
        Product p = new Product();
        p.setProductId(10);
        p.setProductName("Samsung TV");
        p.setPrice(599.99);
        System.out.println("Product 10: "+p);

        return Arrays.asList(new Product(1, "iPhone",999.99, "Mobile"),
                new Product(2, "MacBook",2999.99, "Computer"),
                new Product(3, "Apple TV",99.99, "Accessories"),
                new Product(4, "Apple TV",99.99, ACCESSORIES),
                new Product(5, "Apple TV",99.99, ACCESSORIES),
                new Product(6, "Apple TV",99.99, ACCESSORIES),
                new Product(7, "Apple Watch",599.99, "Watch"),
                new Product(8, "Apple Watch",599.99, "Watch"));
    }

}
