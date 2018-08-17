package com.liumapp.rabbitmq.publisher.service;

import com.liumapp.rabbitmq.publisher.BasicPublisher;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.stereotype.Service;

/**
 * @author liumapp
 * @file HelloWorldPublisher.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/8/17
 */
@Service
public class HelloWorldPublisher extends BasicPublisher {

    @Override
    public void sendMessage(String serviceName, String serviceMethodName, String correlationId, Object request) {
        super.sendMessage(serviceName, serviceMethodName, correlationId, request);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {

    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        super.returnedMessage(message, i, s, s1, s2);
    }

    @Override
    public void setCallBack() {

    }
}
