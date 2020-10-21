import api.HelloApi;
import rpc.RpcExporter;
import rpc.BioRpcExporter;
import service.HelloApiImpl;

import java.io.IOException;

/**
 * @program: xx-rpc
 * @description:
 * @author: weijiankai
 * @create: 2020-10-21 16:05
 **/
public class ProducerTest {
    public static void main(String[] args) throws InterruptedException {
        RpcExporter rpc = new BioRpcExporter(9999);
        rpc.register(HelloApi.class, HelloApiImpl.class);
        try {
            rpc.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
