package com.micro.darren.user.service;

import com.micro.common.service.ITestService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <h3>micro-parent</h3>
 * <p></p>
 *
 * @author : Darren
 * @date : 2020年11月25日 17:55:52
 **/
@Component
@Service(version = "1.0.0", timeout = 1000, interfaceClass = ITestService.class)
public class TestServiceImpl implements ITestService {

    @Override
    public String say(String name) {
        System.out.println("ISayService " + name + " say : hello");
        return name + " say : hello";
    }
}

