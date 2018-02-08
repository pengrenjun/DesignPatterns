package Singleton;


/**
 * 线程安全的懒汉模式
 * 加锁解决线程同步问题 是对懒汉模式的优化
 * synchronized修饰的同步方法比一般方法要慢很多，如果多次调用getInstance()，累积的性能损耗就比较大了
 * @author Administrator
 *
 */
public class SingletonDemonA {
   //类在jvm加载时并不创建,是对饿汉模式的优化,减少了内存的消耗
   private static SingletonDemonA instance=null;
   //构建私有的构造函数,防止实例化创建对象
   private SingletonDemonA(){};
   
   //创建实例构建方法,得到单例,加锁解决了多线程同时调用getInstance()的问题
   public static synchronized SingletonDemonA getInstance(){
	   if(instance==null){
		   //对象还没有被创建
		   return new SingletonDemonA();
	   }
	   return instance;
   }

}
