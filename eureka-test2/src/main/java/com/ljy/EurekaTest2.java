package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @类名: com.ljy
 * @作者:
 * @创建时间: 2019-12-02 08:41
 * @描述:
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaTest2 {
    
    public static void main(String[] args){
        SpringApplication.run(EurekaTest2.class);
    }

}
