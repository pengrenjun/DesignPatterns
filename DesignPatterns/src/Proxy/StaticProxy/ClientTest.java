package Proxy.StaticProxy;

/*��̬����ͻ��˲���*/
public class ClientTest {

    public static void main(String[] args) {


        ProxyObject proxyObject=new ProxyObject(new TargetObject());

        proxyObject.Handler("qwe");

    }
}
