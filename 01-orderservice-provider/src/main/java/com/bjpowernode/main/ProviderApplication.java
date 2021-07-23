package com.bjpowernode.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("orderservice-provider.xml");
        ctx.start();
        System.out.println("订单服务启动");
        System.in.read();

    }

}
