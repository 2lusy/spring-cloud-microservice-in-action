package com.itmuch.cloud.controller;
import com.itmuch.cloud.api.Aapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

  @Autowired
  private DiscoveryClient discoveryClient;
  @Autowired
  private Aapi aapi;


  @GetMapping("/simple")
  public String findById() {
    //摸拟调用失败
    /*int i=1/0;*/


    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    int port = request.getLocalPort();
    return "microservice-provider-user"+port;
  }
  @GetMapping("/getBapi")
  public String getBapi(){
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    int port = request.getLocalPort();
    return "microservice-provider-user"+port+"A调B成功";
  }
  @GetMapping("/getAapi")
  public String getAapi(){
    return aapi.getAapi();
  }

}

