package com.wql.test;

import com.wql.common.util.Result;
import com.wql.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <strong>
 * Desc: 测试统一异常
 * </strong>
 * <p>Author: weiqilong<p>
 * Create Time:2019/4/24 22:50<p>
 */
@RestController
@RequestMapping("/test/error")
public class TestExceptionController {

    @RequestMapping("err1")
    public Result test1() throws Exception {
        int i = 1;
        if(1 == i){
            throw new Exception("1==1,抛错误");
        }

        return Result.success("ok");
    }

    @RequestMapping("/err2")
    public Result test2(){
        int i = 1;
        if(1 == i){
            throw new RuntimeException("1==1,抛异常");
        }

        return Result.success("ok");
    }

    @RequestMapping("/err3")
    public Result test3(){
        int i = 1;
        if(1 == i){
            throw new BusinessException("1==1,抛自定义异常");
        }

        return Result.success("ok");
    }

}
