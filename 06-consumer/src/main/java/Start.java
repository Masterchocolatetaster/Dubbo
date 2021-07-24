import com.bjpowernode.model.Order;
import com.bjpowernode.model.User;
import com.bjpowernode.service.OrderService;
import com.bjpowernode.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ConsumerService;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt =
                new ClassPathXmlApplicationContext("consumer.xml");
    cxt.start();
     ConsumerService consumerService = (ConsumerService) cxt.getBean("consumerService");
     String s = consumerService.buy();
        System.out.println(s);
    }
}
