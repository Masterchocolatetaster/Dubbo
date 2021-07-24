import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cxt =
                new ClassPathXmlApplicationContext("changeService.xml");
        cxt.start();
        System.out.println("服务启动");
        System.in.read();
    }
}
