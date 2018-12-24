package com.itmuch.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.itmuch.config.Configuration1;

import feign.RequestLine;

@FeignClient(name = "microservice-provider-user", configuration = Configuration1.class, fallback = HystrixClientFallback.class)
public interface UserFeignClient {
  @RequestLine("GET /simple")
  public String findById();
}
