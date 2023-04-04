package com.example.dubboconsumer.task;

import java.util.Date;
import com.example.dubboapi.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: 章鑫
 * @project_name：dubbo
 * @name: Task
 * @date: 2023-04-03 16:48
 * @description:
 **/

@Component
@Slf4j
public class Task implements CommandLineRunner {

    @DubboReference
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {
        String result = demoService.hello("world");
        log.info("Receive result ======> " + result);

        new Thread(()-> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    log.info(new Date() + " Receive result ======> " + demoService.hello("world"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}
