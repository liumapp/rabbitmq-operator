package com.liumapp.demo.rabbitmq.operator.publisher;

import com.liumapp.demo.rabbitmq.operator.pattern.Demo1Pattern;
import com.liumapp.rabbitmq.publisher.BasicPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private Demo1Pattern demo1Pattern;

    @Override
    public void send () {
        demo1Pattern.setMsg("this is demo1 publisher");
        logger.info("demo1 publisher send msg : " + demo1Pattern.getMsg());
        this.sendMessage("demo1Consumer", "handle", Integer.toString(10001), demo1Pattern);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info("demo1 publisher get confirmed info : " + correlationData);
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
}
