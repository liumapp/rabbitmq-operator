package com.liumapp.rabbitmq;

import com.liumapp.rabbitmq.consumer.HelloWorldConsumer;
import com.liumapp.rabbitmq.pattern.HelloWorldPattern;
import com.liumapp.rabbitmq.publisher.service.HelloWorldPublisher;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumapp
 * @file RabbitMQOperatorMain.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/8/17
 */
@EnableAutoConfiguration
@Configuration
public class RabbitMQOperatorMain {

    @Bean
    public HelloWorldPublisher helloWorldPublisher () {
        return new HelloWorldPublisher();
    }

    @Bean
    public HelloWorldConsumer helloWorldConsumer () {
        return new HelloWorldConsumer();
    }

    @Bean
    public HelloWorldPattern helloWorldPattern () {
        return new HelloWorldPattern();
    }

}
