package com.micro.gateway.controller;

import com.micro.common.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @Reference(version = "1.0.0")
    private ITestService iTestService;

    /**
     * http://localhost:8080/say?name=123456
     * @param name
     * @return
     */
    @GetMapping("/say")
    public String say(@RequestParam("name") String name){
        return iTestService.say(name);
    }

}
