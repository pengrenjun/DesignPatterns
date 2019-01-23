package Proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DaoProxy implements InvocationHandler {

    //获取目标对象类
    private IUserDao target;



    public Object getProxyInstance(IUserDao target) {
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"开始执行");
        //执行目标对象的方法
        Object result=null;
        try {
            result= method.invoke(target,args);
        } catch (Exception e) {
            System.out.println("执行事务回滚！！！");
        }
        System.out.println(method.getName()+"执行OK!");
        return result;
    }
}
