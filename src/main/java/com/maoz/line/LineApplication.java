package com.maoz.line;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
public class LineApplication {
    public static void main(String[] args) {
        SpringApplication.run(LineApplication.class, args);
    }
}
