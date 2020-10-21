import api.HelloApi;
import rpc.BioRPCClient;

import java.net.InetSocketAddress;

/**
 * @program: xx-rpc
 * @description:
 * @author: weijiankai
 * @create: 2020-10-21 16:18
 **/
public class ConsumerTest {
    public static void main(String[] args) {
        HelloApi service = BioRPCClient.getRemoteProxyObj(HelloApi.class, new InetSocketAddress("localhost", 9999));
        System.out.println(service.sayHello());
    }
}
