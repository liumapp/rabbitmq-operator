package com.liumapp.rabbitmq.pattern;

import org.springframework.stereotype.Component;

/**
 * file HelloWorldPattern.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/9/30
 */
@Component
public class HelloWorldPattern {

    private String name;

    private String sex;

    private Integer age;

    private String msg;

    public HelloWorldPattern() {
    }

    public HelloWorldPattern(String name, String sex, Integer age, String msg) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public HelloWorldPattern setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public HelloWorldPattern setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public HelloWorldPattern setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public HelloWorldPattern setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "HelloWorldPattern{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", msg='" + msg + '\'' +
                '}';
    }
}
