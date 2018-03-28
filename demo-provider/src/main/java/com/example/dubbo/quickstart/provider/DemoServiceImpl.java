package com.example.dubbo.quickstart.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.quickstart.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author tanwenhai@gusoftware.com
 */
@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {
    private Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public String sayHello(String name) {
        log.info("RPC INVOKE");
        return "Hello " + name;
    }
}