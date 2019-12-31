package example.chain;

import example.handler.HelloWordHandler;
import example.handler.HelloWorldHandler2;
import org.apache.axis.SimpleChain;

/**
 * Chain用于实现一连串的Handler功能
 * @author : zhaopanqi
 * @date : Created in 2019/12/31
 */
public class HelloWordChain extends SimpleChain {

    private static final long UID = 2222333L;

    public HelloWordChain(){
        //实例化需要的handler
        HelloWordHandler handler1 = new HelloWordHandler();
        HelloWorldHandler2 handler2 = new HelloWorldHandler2();

        //添加上需要配置的handler
        this.addHandler(handler1);
        this.addHandler(handler2);
    }

}
