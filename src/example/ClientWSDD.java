package example;

import org.apache.axis.client.Service;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

/**
 * 本地编写测试类通过web-service调用
 * @author : zhaopanqi
 * @date : Created in 2019/12/31
 */
public class ClientWSDD {


    public static void main(String[] args){
        try {
            //不带拦截器的服务
            //String url = "http://localhost:8080/webservice/services/HelloWorld?wsdl";
            //带拦截器的服务
            //String url = "http://localhost:8080/webservice/services/HelloWorldWSDDHandler?wsdl";
            //带连接器链条的服务chain
            String url = "http://localhost:8080/webservice/services/HelloWorldWSDDChain?wsdl";
            //生成服务对象Service
            Service service = new Service();
            Call call = (Call) service.createCall();
            //设置Endpoint地址
            call.setTargetEndpointAddress(new java.net.URL(url).toString());
            //绑定请求方法名称
            call.setOperationName(new QName(url, "sayHelloWorldFrom"));
            //通过call.invoke 调用服务，获取返回值
            String result = (String) call.invoke(new Object[]{"xw"});
            System.out.println("result = " + result);
        }catch (ServiceException e){
            System.out.println("ServiceException");
            e.printStackTrace();
        }catch (RemoteException e){
            System.out.println("RemoteException");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException");
            e.printStackTrace();
        }
    }

}
