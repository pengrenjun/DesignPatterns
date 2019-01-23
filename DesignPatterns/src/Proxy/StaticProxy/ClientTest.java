package Proxy.StaticProxy;

/*静态代理客户端测试*/
public class ClientTest {

    public static void main(String[] args) {


        ProxyObject proxyObject=new ProxyObject(new TargetObject());

        proxyObject.Handler("qwe");

    }
}
