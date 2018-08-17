package com.liumapp.demo.rabbitmq.operator;

import com.liumapp.rabbitmq.RabbitMQOperatorMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author liumapp
 * @file DemoMain.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/8/17
 */
@SpringBootApplication
@Import(RabbitMQOperatorMain.class)
public class DemoMain {

    public static void main (String[] args) {
        SpringApplication.run(DemoMain.class, args);
    }

}
