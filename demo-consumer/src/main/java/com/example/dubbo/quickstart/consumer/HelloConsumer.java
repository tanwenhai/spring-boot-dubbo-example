package com.example.dubbo.quickstart.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.quickstart.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tanwenhai@gusoftware.com
 */
@Controller
@RequestMapping
public class HelloConsumer {
    @Reference(url = "dubbo://127.0.0.1:20880")
    private DemoService demoService;

    @RequestMapping("/test")
    @ResponseBody
    public String hello() {
        return demoService.sayHello("wxj");
    }
}
