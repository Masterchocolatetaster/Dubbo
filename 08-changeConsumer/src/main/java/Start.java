import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ConsumerService;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt =
                new ClassPathXmlApplicationContext("08-change.xml");
        cxt.start();
        ConsumerService consumerService = (ConsumerService) cxt.getBean("consumerService");
        consumerService.change("aaaa");
    }
}
