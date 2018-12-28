package com.itmuch.cloud;

import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
/*@EnableDiscoveryClient*/
/*@EnableApolloConfig*/
public class MicroserviceSimpleProviderUserApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSimpleProviderUserApplication.class, args);
  }
}
