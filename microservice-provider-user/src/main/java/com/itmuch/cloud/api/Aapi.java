package com.itmuch.cloud.api;

import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "microservice-consumer-movie-feign-customizing-without-hystrix")
public interface Aapi {

    @RequestMapping(value = "getAapi",method = RequestMethod.GET)
    public String getAapi();
}
