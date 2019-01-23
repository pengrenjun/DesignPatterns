package Proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*Ŀ�����������๤��(��) ����jdk�Ķ�̬����*/
public class DaoProxyFactory {

    //��ȡĿ�������
    private  Object target;

    //���������� �ṩĿ����
    public DaoProxyFactory(Object target) {
        this.target = target;
    }

    //��Ŀ��������ɴ������
    public  Object getProxyInstance(){

       return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            //����Ŀ������ִ�з���
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
        });

    }


}
