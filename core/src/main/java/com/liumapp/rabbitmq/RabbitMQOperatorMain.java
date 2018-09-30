package com.liumapp.rabbitmq;

import com.liumapp.rabbitmq.config.RabbitMqOperatorConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * author liumapp
 * file RabbitMQOperatorMain.java
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/17
 */
@EnableAutoConfiguration
@Configuration
@Import(RabbitMqOperatorConfig.class)
@ComponentScan(basePackages = "com.liumapp.rabbitmq")
public class RabbitMQOperatorMain {

}
