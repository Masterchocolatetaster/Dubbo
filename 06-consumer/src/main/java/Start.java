import com.bjpowernode.model.Order;
import com.bjpowernode.model.User;
import com.bjpowernode.service.OrderService;
import com.bjpowernode.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt =
                new ClassPathXmlApplicationContext("consumer.xml");
      OrderService orderService = (OrderService) cxt.getBean("invokeOrderService");
        UserService userService = (UserService) cxt.getBean("invokeUserService");
        User user = userService.createUser("孟","202");
      Order order = orderService.creatOrder("手机","孟");
      System.out.println(order);
      System.out.println(user);
    }
}
