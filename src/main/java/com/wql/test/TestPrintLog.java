package com.wql.test;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 测试日志打印
 * @author weiqilong
 * @CreateTime 2019年1月8日 下午11:54:25
 * @Email 398581645@qq.com
 */
@Service
public class TestPrintLog {
	
	private static final Logger logger = LogManager.getLogger(TestPrintLog.class);
	
	/**
	 * 测试打印日志
	 * @Async 异步方式：注意:方法内容调用，不是异步
	 * @author weiqilong
	 * @CreateTime 2019年1月8日 下午11:49:56
	 * @Email 398581645@qq.com
	 */
	@Async
	public void testPringLog1(){
		for(int i = 0;i<99999999;i++){
			logger.error("错误日志打印测试->{}",LocalDateTime.now().toString());
			//Thread.sleep(50);
		}
	}
	
	@Async
	public void testPringLog2(){
		for(int i = 0;i<99999999;i++){
			logger.error("错误日志打印测试->{}",LocalDateTime.now().toString());
			//Thread.sleep(50);
		}
	}
	
	@Async
	public void testPringLog3(){
		for(int i = 0;i<99999999;i++){
			logger.error("错误日志打印测试->{}",LocalDateTime.now().toString());
			//Thread.sleep(50);
		}
	}
	
	@Async
	public void testPringLog4(){
		for(int i = 0;i<99999999;i++){
			logger.error("错误日志打印测试->{}",LocalDateTime.now().toString());
			//Thread.sleep(50);
		}
	}
	@Async
	public void testPringLog5(){
		for(int i = 0;i<99999999;i++){
			logger.error("错误日志打印测试->{}",LocalDateTime.now().toString());
			//Thread.sleep(50);
		}
	}
	@Async
	public void testPringLog6(){
		for(int i = 0;i<99999999;i++){
			logger.error("错误日志打印测试->{}",LocalDateTime.now().toString());
			//Thread.sleep(50);
		}
	}
	@Async
	public void testPringLog7(){
		for(int i = 0;i<99999999;i++){
			logger.error("错误日志打印测试->{}",LocalDateTime.now().toString());
			//Thread.sleep(50);
		}
	}
	@Async
	public void testPringLog8(){
		for(int i = 0;i<99999999;i++){
			logger.info("错误日志打印测试->{}",LocalDateTime.now().toString());
			//Thread.sleep(50);
		}
	}
}
