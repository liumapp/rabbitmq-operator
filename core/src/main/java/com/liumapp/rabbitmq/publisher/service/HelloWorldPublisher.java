package com.liumapp.rabbitmq.publisher.service;

import com.liumapp.rabbitmq.pattern.HelloWorldPattern;
import com.liumapp.rabbitmq.publisher.BasicPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * file HelloWorldPublisher.java
 * author liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/17
 */
@Service
public class HelloWorldPublisher extends BasicPublisher {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HelloWorldPattern helloWorldPattern;

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info("test publisher get confirmed info : " + correlationData);
        if (ack) {
            logger.info("send msg success");
        } else {
            logger.error("send msg failed and the reason is : " + cause);
        }
    }

    @Override
    public void setCallBack() {
        rabbitTemplate.setReturnCallback(this);
        rabbitTemplate.setConfirmCallback(this);
    }

    @Override
    public void send(String msg) {
        helloWorldPattern.setName("liumapp");
        helloWorldPattern.setAge(24);
        helloWorldPattern.setSex("boy");
        helloWorldPattern.setMsg("send msg to do something");
        logger.info("sender: " + helloWorldPattern.toString());
        this.sendMessage("helloWorldConsumer", "handle", Integer.toString(10000), helloWorldPattern);
    }

}
