package ir.david.m1.rest;

import ir.david.m1.api.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {
    @Autowired
    Calculator calculator;

    @RequestMapping(value = "/")
    public String hello() {
        return calculator.out();
    }
}
