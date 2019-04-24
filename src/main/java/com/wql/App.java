package com.wql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 入口
 * 下次记得写aop拦截计算方法耗时 拦截注解
 * 记得写拦截器 模拟拦截验签
 * 记得添加校验入参工具
 * 记得测试是否能连通数据库
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
