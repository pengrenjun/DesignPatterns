package Proxy.StaticProxy;

import jdk.internal.org.objectweb.asm.Handle;

/*代理对象 与目标对象实现相同的接口*/
public class ProxyObject implements StaticProxyInterface {

    //获取被代理对象的信息
    private StaticProxyInterface staticProxyInterface;

    public ProxyObject(StaticProxyInterface staticProxyInterface) {
        //传入被代理的类
        this.staticProxyInterface = staticProxyInterface;
    }

    @Override
    public void Handler(String str) {
        str=str+":"+System.currentTimeMillis();
        System.out.println("目标对象已经被静态代理处理了");
        staticProxyInterface.Handler(str);
    }
}
