package com.itmuch.cloud.api;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user")
public interface Bapi {
    @RequestLine("GET /getBapi")
    public String getBapi();
}
