package service;

import com.bjpowernode.service.OrderService;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Autowired
    OrderService orderService;
    @Autowired
    UserService userService;

    public String buy(){
        return orderService.creatOrder("手机","10").toString()+userService.createUser("孟",
                "202");
    }
}
