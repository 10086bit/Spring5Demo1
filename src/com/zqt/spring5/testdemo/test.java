package com.zqt.spring5.testdemo;

import com.zqt.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public  void TestAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user=context.getBean("user",User.class);
        user.add();
        System.out.println(user);
    }
}
