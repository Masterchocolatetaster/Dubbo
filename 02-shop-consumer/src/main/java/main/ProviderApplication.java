package main;

import com.bjpowernode.model.Order;
import com.bjpowernode.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;

public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("shop-consumer.xml");
        ctx.start();
        OrderService orderService =(OrderService)ctx.getBean(
                "invokeOrderService");
       Order order = orderService.createOrder(1,"phone");
        System.out.println("order"+order);
    }

}
