package com.tqzl.iot.auth;


import com.tqzl.iot.auth.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableRyFeignClients
@SpringBootApplication
@EnableSwagger2
public class IotAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotAuthApplication.class, args);
    }

}
