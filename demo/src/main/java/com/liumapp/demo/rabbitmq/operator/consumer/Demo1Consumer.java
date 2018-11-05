package com.liumapp.demo.rabbitmq.operator.consumer;

import com.liumapp.demo.rabbitmq.operator.pattern.Demo1Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * file Demo1Consumer.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/9/30
 */
@Service
public class Demo1Consumer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void handle (Demo1Pattern demo1Pattern) {
        logger.info("demo1 consumer service get pattern : " + demo1Pattern.toString());
    }

    public void handle2 (Demo1Pattern demo1Pattern) {
        logger.info("demo1 consumer handle2 service get pattern : " + demo1Pattern.getMsg());
    }

}
