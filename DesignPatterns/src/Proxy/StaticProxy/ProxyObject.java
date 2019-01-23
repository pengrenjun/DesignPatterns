package Proxy.StaticProxy;

import jdk.internal.org.objectweb.asm.Handle;

/*������� ��Ŀ�����ʵ����ͬ�Ľӿ�*/
public class ProxyObject implements StaticProxyInterface {

    //��ȡ������������Ϣ
    private StaticProxyInterface staticProxyInterface;

    public ProxyObject(StaticProxyInterface staticProxyInterface) {
        //���뱻�������
        this.staticProxyInterface = staticProxyInterface;
    }

    @Override
    public void Handler(String str) {
        str=str+":"+System.currentTimeMillis();
        System.out.println("Ŀ������Ѿ�����̬��������");
        staticProxyInterface.Handler(str);
    }
}
