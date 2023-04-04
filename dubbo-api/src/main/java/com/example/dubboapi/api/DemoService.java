package com.example.dubboapi.api;

/**
 * @author: 章鑫
 * @project_name：dubbo
 * @name: DemoService
 * @date: 2023-04-03 16:41
 * @description:
 **/

public interface DemoService {

    /**
     * 测试dubbo远程调用
     * @param name name
     * @return String
     */
    String hello(String name);
}
