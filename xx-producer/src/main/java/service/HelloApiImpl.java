package service;

import api.HelloApi;
import pojo.User;

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

    public User getUser() {
        return User.builder().id("1").name("张三").build();
    }

}
