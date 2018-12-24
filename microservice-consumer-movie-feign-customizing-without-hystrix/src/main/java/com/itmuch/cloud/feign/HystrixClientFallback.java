package com.itmuch.cloud.feign;
import org.springframework.stereotype.Component;
@Component
public class HystrixClientFallback implements UserFeignClient {

  @Override
  public String findById() {

    return "这是调用失败后的处理";
  }
}