package com.liumapp.demo.rabbitmq.operator.simple;

import com.liumapp.rabbitmq.publisher.service.HelloWorldPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author liumapp
 * @file SendTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/8/17
 */
@Component
@EnableScheduling
public class SendTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private HelloWorldPublisher helloWorldPublisher;

    /**
     * on prod model
     * plz annotate thie method
     */
    @Scheduled(fixedDelay = 3000)
    public void send () {
        logger.info("test begin ");
        helloWorldPublisher.send();
    }

}