package com.example.demo2714;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo2714.mapper")
public class Demo2714Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2714Application.class, args);
    }

}
