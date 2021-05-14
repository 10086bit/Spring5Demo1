package com.zqt.spring5.aopDemo.beizq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class User {
    @Value("张三")
    private String name;
    public void add(int a){
        System.out.println(name+a);
    }
}
