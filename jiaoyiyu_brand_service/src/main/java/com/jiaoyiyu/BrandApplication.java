package com.jiaoyiyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * BrandApplication class
 *
 * @author maochaoying
 * @date 2019/10/21
 */
@SpringBootApplication
@MapperScan(basePackages = "com.jiaoyiyu.dao")
public class BrandApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrandApplication.class, args);
    }
}
