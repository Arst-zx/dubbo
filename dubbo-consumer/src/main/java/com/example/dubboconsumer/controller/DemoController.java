package com.example.dubboconsumer.controller;

import com.example.dubboapi.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 章鑫
 * @project_name：dubbo
 * @name: DemoController
 * @date: 2023-04-03 17:31
 * @description:
 **/

@RestController
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @GetMapping("test")
    public String test(String name) {
        return demoService.hello(name);
    }
}
