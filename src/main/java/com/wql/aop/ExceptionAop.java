package com.wql.aop;

import com.wql.common.util.Result;
import com.wql.exception.BusinessException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <strong>
 * Desc: 统一异常处理
 * </strong>
 * <p>Author: weiqilong<p>
 * Create Time:2019/4/24 22:27<p>
 */
@RestControllerAdvice
public class ExceptionAop {
    private static final Logger logger = LogManager.getLogger(ExceptionAop.class);

    /**
     * 自定义异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public Result businessException(BusinessException e){
        //此处以后可以修改为入库
        logger.error("系统异常!"+e.getMessage());
        return Result.error("系统异常!",e.getMessage());
    }

    /**
     * 运行时异常
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public Result runtimeException(RuntimeException e){
        //此处以后可以修改为入库
        logger.error("系统未知异常！"+e.getMessage());
        return Result.error("系统未知异常！",e.getMessage());
    }

    /**
     * exception
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e){
        //此处以后可以修改为入库
        logger.error("系统ERROR!"+e.getMessage());
        return Result.error("系统ERROR!",e.getMessage());
    }
}
