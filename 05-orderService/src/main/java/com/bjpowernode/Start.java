package com.bjpowernode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cxt =
                new ClassPathXmlApplicationContext("order.xml");
        cxt.start();
        System.out.println("订单服务启动!");
        System.in.read();
    }
}
