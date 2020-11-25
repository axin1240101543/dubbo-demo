package com.micro.gateway.rmi;

import java.rmi.Remote;

public interface ISayService extends Remote {

    String say(String name) throws Exception;

}
