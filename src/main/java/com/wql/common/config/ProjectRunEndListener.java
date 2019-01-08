package com.wql.common.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wql.test.TestPrintLog;

/**
 * 程序启动完毕后执行
 * @author weiqilong
 * @CreateTime 2019年1月8日 下午9:44:38
 * @Email 398581645@qq.com
 */
@Component
public class ProjectRunEndListener implements CommandLineRunner{
	private static final Logger logger = LogManager.getLogger(ProjectRunEndListener.class);
	private static final Logger loggerWarn = LogManager.getLogger("warn");
	@Autowired
	private TestPrintLog testPrintLog;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("程序启动监听-->{}-->{}","AA","BB");
		loggerWarn.info("程序启动监听 warn-->{}-->{}","AA","BB");
		
		testPrintLog.testPringLog1();
		testPrintLog.testPringLog2();
		testPrintLog.testPringLog3();
		testPrintLog.testPringLog4();
		testPrintLog.testPringLog5();
		testPrintLog.testPringLog6();
		testPrintLog.testPringLog7();
		testPrintLog.testPringLog8();
		
	}
}
