package com.zqt.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "userServer")
public class Userserver {
    @Autowired
    private User user;

   /* public void setUser(User user) {
        this.user = user;
    }*/

    public  void test(){
        System.out.println("注释注入依赖");
        System.out.println(user);
    }
}
