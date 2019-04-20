package com.wql.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * a b
 * master master xxxxxxx
 */
public class TestLog {
	private static final Logger logger = LogManager.getLogger(TestLog.class);
	
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		logger.error("错误日志....");
		logger.info("信息日志....");
	}
}
