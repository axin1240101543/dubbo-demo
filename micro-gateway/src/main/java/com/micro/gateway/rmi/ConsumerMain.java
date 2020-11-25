package com.micro.gateway.rmi;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * <h3>micro-parent</h3>
 * <p></p>
 *
 * @author : Darren
 * @date : 2020年11月25日 17:28:46
 **/
public class ConsumerMain {

    public static void main(String[] args) throws Exception {
        //注册中心
        Registry registry = LocateRegistry.getRegistry(8888);
        //发现服务
        ISayService iSayService = (ISayService) registry.lookup("ISayService");
        //调起服务
        String result = iSayService.say("张三");
        System.out.println("ConsumerMain " + result);
    }

}

