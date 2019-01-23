package Proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*目标对象类代理类工厂(对) 基于jdk的动态代理*/
public class DaoProxyFactory {

    //获取目标对象类
    private  Object target;

    //创建代理工厂 提供目标类
    public DaoProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public  Object getProxyInstance(){

       return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            //代理目标对象的执行方法
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
        });

    }


}
