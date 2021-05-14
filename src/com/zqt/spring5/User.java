package com.zqt.spring5;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
@Component(value = "User")
public class User {
    private  String name;
    private String [] course;
    private Map<String,String> core;
    private List<String> list;
/*    public User(String name) {
        this.name = name;
    }*/

    public void setCore(Map<String, String> core) {
        this.core = core;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void Showname(){

        System.out.println(name);

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", course=" + Arrays.toString(course) +
                ", core=" + core +
                ", list=" + list +
                '}';
    }
}
