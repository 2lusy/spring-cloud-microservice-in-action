package com.itmuch.cloud.controller;

import com.itmuch.cloud.api.Bapi;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.feign.UserFeignClient;

@RestController
public class MovieController {
  @Autowired
  private Bapi bapi;

 // private UserFeignClient userFeignClient;


  @GetMapping("/getBapi")
  public String getBapi(){
    return bapi.getBapi();
  }

  @GetMapping("/getAapi")
  public String getAapi(){
    return "B调a成功";
   // return bapi.getBapi();
  }

}
