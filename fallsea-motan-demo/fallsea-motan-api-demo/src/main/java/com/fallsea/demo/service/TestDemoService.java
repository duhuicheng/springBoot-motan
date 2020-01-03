package com.fallsea.demo.service;

import com.weibo.api.motan.transport.async.MotanAsync;

@MotanAsync
public interface TestDemoService {
    String test();
}
