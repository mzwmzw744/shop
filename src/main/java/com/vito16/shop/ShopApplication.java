package com.vito16.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/03/14
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableWebMvc
@EnableTransactionManagement
public class ShopApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class,args);
	}

}
