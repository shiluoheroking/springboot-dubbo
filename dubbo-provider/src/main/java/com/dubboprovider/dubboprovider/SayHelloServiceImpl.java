package com.dubboprovider.dubboprovider;

import com.springboot.dubbo.study.SayHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 *
 * @author z小赵
 *
 * <p>使用dubbo的service注解对服务进行暴露操作</p>
 */
@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello() {
        System.out.println("client invoke start");
        return "hello dubbo";
    }
}
