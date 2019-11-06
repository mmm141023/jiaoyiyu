package com.jiaoyiyu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jiaoyiyu.user.mapper")
public class JiaoyiyuUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiaoyiyuUserServiceApplication.class, args);
	}

}
