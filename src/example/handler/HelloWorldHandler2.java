package example.handler;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

/**
 * @author : zhaopanqi
 * @date : Created in 2019/12/31
 */
public class HelloWorldHandler2 extends BasicHandler {

    private static final long UID = 3222222L;

    private static  long COUNT = 0L;

    private int requestCount = 0;

    @Override
    public void invoke(MessageContext messageContext) throws AxisFault {
        requestCount++;
        COUNT++;
        String status = (String) this.getOption("status");
        System.out.println("HelloWorldHandler2 status  " + status +
                ", COUNT " + COUNT +
                ", requestCount " + requestCount);
    }

}
