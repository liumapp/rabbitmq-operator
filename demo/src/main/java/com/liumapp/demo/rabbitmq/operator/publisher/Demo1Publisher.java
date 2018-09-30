package com.liumapp.demo.rabbitmq.operator.publisher;

import com.liumapp.rabbitmq.publisher.BasicPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.stereotype.Service;

/**
 * file Demo1Publisher.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/9/30
 */
@Service
public class Demo1Publisher extends BasicPublisher {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void send () {

    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {

    }

    @Override
    public void setCallBack() {

    }
}
