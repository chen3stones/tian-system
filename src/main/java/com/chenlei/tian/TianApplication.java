package com.chenlei.tian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
@MapperScan(basePackages = "com.chenlei.tian.dao")
@SpringBootApplication
public class TianApplication {
    public static void main(String[] args) {
        SpringApplication.run(TianApplication.class, args);
    }

}

