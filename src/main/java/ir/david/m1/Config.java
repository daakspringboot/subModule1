package ir.david.m1;

import ir.david.m1.api.Calculator;
import ir.david.m1.rest.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Calculator getCalculator() {
        return new Calculator();
    }
}
