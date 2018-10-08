package com.liumapp.demo.rabbitmq.operator.simple;

import com.liumapp.demo.rabbitmq.operator.publisher.Demo1Publisher;
import com.liumapp.rabbitmq.publisher.service.HelloWorldPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * file Demo1.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/9/30
 */
@Component
@EnableScheduling
public class Demo1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private Demo1Publisher demo1Publisher;

    /**
     * on prod model
     * plz annotate thie method
     */
    @Scheduled(fixedDelay = 3000)
    public void send () {
        logger.info("test begin ");
        demo1Publisher.send("");
    }


}
