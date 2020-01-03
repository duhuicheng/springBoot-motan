package com.fallsea.demo.service.impl;

import com.fallsea.demo.service.TestDemoService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

@MotanService
public class TestDemoServiceImpl implements TestDemoService {

    @Override
    public String test() {
        System.out.println(123);
        System.out.println(234);
        return "TestDemoImpl test";
    }
}
