package org.example.productmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductMicroservicesApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProductMicroservicesApplication.class, args);

        System.out.println("Product Microservices Application Started");
    }

}
