package Proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DaoProxy implements InvocationHandler {

    //��ȡĿ�������
    private IUserDao target;



    public Object getProxyInstance(IUserDao target) {
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"��ʼִ��");
        //ִ��Ŀ�����ķ���
        Object result=null;
        try {
            result= method.invoke(target,args);
        } catch (Exception e) {
            System.out.println("ִ������ع�������");
        }
        System.out.println(method.getName()+"ִ��OK!");
        return result;
    }
}
