package com.zqt.spring5.testdemo;

import com.zqt.spring5.User;
import org.springframework.beans.factory.FactoryBean;
/*工厂bean给其他bean赋值*/
public class Fbean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("王五");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
