package com.liumapp.rabbitmq.consumer;

import com.liumapp.rabbitmq.pattern.HelloWorldPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author liumapp
 * @file HelloWorldConsumer.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/8/17
 */
@Service
public class HelloWorldConsumer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void handle (HelloWorldPattern helloWorldPattern) {
        logger.info("test consumer service get pattern : " + helloWorldPattern.toString());
        // and do something you like
    }

}
