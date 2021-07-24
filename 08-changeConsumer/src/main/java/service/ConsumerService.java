package service;

import com.bjpowernode.service.ChangeService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @DubboReference(version = "1.0",url = "dubbo://localhost:20880",check =
            false,interfaceClass = ChangeService.class)
    ChangeService changeService;

    public void change(String str){
        System.out.println(changeService.changString(str));
    }
}
