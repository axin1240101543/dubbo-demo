package com.micro.gateway.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * <h3>micro-parent</h3>
 * <p></p>
 *
 * @author : Darren
 * @date : 2020年11月25日 17:24:05
 **/
public class ProviderMain {

    public static void main(String[] args) throws RemoteException {
        //实例化  要暴露出来的接口
        ISayService sayService = new SayServiceImpl();
        //开启本地服务
        ISayService iSayService = (ISayService) UnicastRemoteObject.exportObject(sayService, 8080);
        //服务注册中心
        Registry registry = LocateRegistry.createRegistry(8888);
        //注册服务
        registry.rebind("ISayService", iSayService);

    }

}

