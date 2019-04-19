package com.wql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 入口
 * @author weiqilong
 * CREATE TIME 2018年11月5日 下午2:45:40
 */
@SpringBootApplication
@EnableTransactionManagement
//@ComponentScan(basePackages = { "com.wql" })
@EnableAsync
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class,args);
	}
}
