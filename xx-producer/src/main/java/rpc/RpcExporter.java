package rpc;

import java.io.IOException;

/**
 * @program: xx-rpc
 * @description:
 * @author: weijiankai
 * @create: 2020-10-21 13:52
 **/
public interface RpcExporter {

    void stop();

    void start() throws IOException;

    void register(Class serviceInterface, Class impl);

    int getPort();

    boolean isRunning();

}
