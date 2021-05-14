package com.zqt.spring5.testdemo;

import com.zqt.spring5.aopDemo.beizq.User;
import com.zqt.spring5.Userserver;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
/*    public  void TestAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user=context.getBean("user",User.class);
        User user2=context.getBean("user",User.class);
        user.toString();
        user2.toString();
        System.out.println(user);
        System.out.println(user2);
    }*/
/*    public  void TestAdd2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        User user=context.getBean("factoryBean",User.class);

        user.toString();
        System.out.println(user);
    }*/

        public  void TestAdd(){
            ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
            Lifttime lf=context.getBean("Life",Lifttime.class);
            System.out.println("第四步创建实例化对象");

              // System.out.println(lf);
            ((ClassPathXmlApplicationContext) context).close();
        }
        @Test
        public  void TestAdd2(){
            ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
            Userserver us=context.getBean("userServer",Userserver.class);
//            System.out.println("第四步创建实例化对象");
            us.test();
            System.out.println(us);
//            ((ClassPathXmlApplicationContext) context).close();
        }
    @Test
    public  void TestAdd3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        User us=context.getBean("user",User.class);
        us.add(1);
        System.out.println(us);
    }
}
