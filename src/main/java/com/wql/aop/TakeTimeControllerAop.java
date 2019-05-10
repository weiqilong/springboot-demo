package com.wql.aop;

import com.wql.exception.BusinessException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <strong>
 * Desc: controller耗时统计
 * </strong>
 * <p>Author: weiqilong<p>
 * Create Time:2019/5/10 21:34<p>
 */
@Aspect
@Component
public class TakeTimeControllerAop {
    private static final Logger loggerWarn = LogManager.getLogger(TakeTimeControllerAop.class);

    /**
     * Desc: 切面，只织入controller
     * Author: weiqilong
     * Create Time:2019/5/10 21:40
     * @param
     * @return void
     */
    @Pointcut("execution(public * com.wql.*..*Controller.*(..))")
    public void pointcut(){}

    @Around("pointcut()")
    public Object takeTimeAround(ProceedingJoinPoint joinPoint){
        try {
            Object result = joinPoint.proceed();
            return result;
        } catch (Throwable throwable) {
            throw  new BusinessException(throwable.getMessage());
        }finally {
            
        }
    }
}
