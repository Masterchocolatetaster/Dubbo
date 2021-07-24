package serviceimpl;

import com.bjpowernode.service.ChangeService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = com.bjpowernode.service.ChangeService.class,
        version =
        "1.0",timeout = 8000,register = false)
public class ChangeServiceImpl implements ChangeService {
    public String changString(String str) {
        return str.toUpperCase();
    }
}
