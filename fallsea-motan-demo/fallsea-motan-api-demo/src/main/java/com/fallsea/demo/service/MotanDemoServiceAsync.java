package com.fallsea.demo.service;

import com.weibo.api.motan.rpc.ResponseFuture;

public interface MotanDemoServiceAsync extends MotanDemoService {
  ResponseFuture helloAsync(String name);

  ResponseFuture testAsync();
}
