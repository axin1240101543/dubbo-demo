package com.micro.gateway.rmi;

/**
 * <h3>micro-parent</h3>
 * <p></p>
 *
 * @author : Darren
 * @date : 2020年11月25日 17:22:19
 **/
public class SayServiceImpl implements ISayService{

    @Override
    public String say(String name) throws Exception {
        System.out.println("ISayService " + name + " say : hello");
        return name + " say : hello";
    }
}

