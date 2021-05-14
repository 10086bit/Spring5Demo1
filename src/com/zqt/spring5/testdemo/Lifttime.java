package com.zqt.spring5.testdemo;

public class Lifttime {
    private String testvalue;

    public Lifttime() {
        System.out.println("第一步创建无参实例");
    }

    public void setTestvalue(String testvalue) {
        this.testvalue = testvalue;
        System.out.println("第二步调用set方法");
    }
    public void init(){
        System.out.println("第三步执行初始化");
    }
    public void destroy(){
        System.out.println("第五步执行销毁");
    }
}
