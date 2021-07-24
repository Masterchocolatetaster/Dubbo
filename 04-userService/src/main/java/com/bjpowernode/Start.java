package com.bjpowernode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cxt =
                new ClassPathXmlApplicationContext("user.xml");
        cxt.start();
        System.out.println("用户服务启动!");
        System.in.read();
    }
}
