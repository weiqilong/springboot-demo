package com.wql.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <strong>
 * Desc: 测试读取配置文件
 * </strong>
 * <p>Author: weiqilong<p>
 * Create Time:2019/5/8 21:46<p>
 */
@RestController
@RequestMapping("/test")
public class TestPropertiesController {
    @Value("${app.constants.desc}")
    private String desc;

    @RequestMapping("etc")
    public String etc(){
        return desc;
    }
}
