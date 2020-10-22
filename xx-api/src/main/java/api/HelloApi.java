package api;

import pojo.User;

/**
 * @program: xx-rpc
 * @description:
 * @author: weijiankai
 * @create: 2020-10-21 11:18
 **/
public interface HelloApi {

    String sayHello();

    User getUser();
}
