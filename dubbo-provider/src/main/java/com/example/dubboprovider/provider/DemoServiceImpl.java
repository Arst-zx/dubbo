package com.example.dubboprovider.provider;

import com.example.dubboapi.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import java.util.Date;

/**
 * @author: 章鑫
 * @project_name：dubbo
 * @name: DemoServiceImpl
 * @date: 2023-04-03 16:42
 * @description:
 **/

@DubboService
@Slf4j
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello(String name) {
        log.info(new Date() + " Receive result ======> " + "Hello " + name);
        return "Hello " + name;
    }
}
