package com.liumapp.demo.rabbitmq.operator.pattern;

import org.springframework.stereotype.Component;

/**
 * file Demo1Pattern.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/9/30
 */
@Component
public class Demo1Pattern {

    private String msg;

    public Demo1Pattern() {
    }

    public Demo1Pattern(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Demo1Pattern setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
