package Proxy.StaticProxy;

/*Ŀ�����*/
public class TargetObject implements  StaticProxyInterface {
    @Override
    public void Handler(String str) {
        System.out.println("�����str:"+str);
    }
}
