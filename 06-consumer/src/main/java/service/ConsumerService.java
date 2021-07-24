package service;

import com.bjpowernode.service.OrderService;
import com.bjpowernode.service.UserService;
import org.apache.dubbo.config.ReferenceConfig;

public class ConsumerService {
    OrderService orderService;
    UserService userService;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String buy(){
        return orderService.creatOrder("手机","1").toString()+userService.createUser("孟","202");
    }

}
