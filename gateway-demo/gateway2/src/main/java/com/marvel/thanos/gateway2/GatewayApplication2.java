package com.marvel.thanos.gateway2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author fuyongde
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@ServletComponentScan("com.marvel.thanos.gateway2")
public class GatewayApplication2 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayApplication2.class)
                .properties("spring.profiles.active=nacos")
                .run(args);
    }

}
