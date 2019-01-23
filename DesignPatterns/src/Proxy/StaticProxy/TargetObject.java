package Proxy.StaticProxy;

/*目标对象*/
public class TargetObject implements  StaticProxyInterface {
    @Override
    public void Handler(String str) {
        System.out.println("传入的str:"+str);
    }
}
