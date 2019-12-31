package example.handler;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

/**
 * web-service拦截器
 * @author : zhaopanqi
 * @date : Created in 2019/12/31
 */
public class HelloWordHandler extends BasicHandler {

    private static final long UID = 2333333L;

    private static long COUNT = 0L;

    private int requestCount = 0;

    /**
     * messageContext是一个Axis的上下文，里面存储了一些Axis和WebService的基本信息。
     * 这个类中有一个静态变量COUNT用于记录Handler的被调用次数，每次Handler被调用的时候都将加一
     *
     * 编写完成handler之后需要在server-config.esdd里面声明
     * */
    @Override
    public void invoke(MessageContext messageContext) throws AxisFault {
        requestCount++;
        COUNT++;
        String status = (String) this.getOption("status");
        System.out.println("HelloWorldHandler status  " + status +
                ", COUNT " + COUNT +
                ", requestCount " + requestCount);
    }
}
