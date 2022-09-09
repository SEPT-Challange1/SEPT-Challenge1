package com.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAsync
@SpringBootApplication
@MapperScan(basePackages = {"com.item.mapper"})
@ServletComponentScan(basePackages = {"com.item.dao"})
public class ItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }

}
