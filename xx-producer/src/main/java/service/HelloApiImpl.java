package service;

import api.HelloApi;

/**
 * @program: xx-rpc
 * @description:
 * @author: weijiankai
 * @create: 2020-10-21 11:19
 **/
public class HelloApiImpl implements HelloApi {
    public String sayHello() {
        return "Producer says hello";
    }
}
