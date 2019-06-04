package com.marvel.thanos.order.bootstrap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderApplication.class)
                .properties("spring.profiles.active=nacos")
                .run(args);
    }

}
