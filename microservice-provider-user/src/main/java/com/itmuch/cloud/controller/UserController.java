package com.itmuch.cloud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private DiscoveryClient discoveryClient;

  @GetMapping("/simple")
  public String findById() {
    //摸拟调用失败
    /*int i=1/0;*/
    return "microservice-provider-user";
  }

}

