package Singleton;

/**
 * 静态内部类 这种方式同样利用了类加载机制来保证只创建一个instance实例。 它与饿汉模式一样，也是利用了类加载机制，因此不存在多线程并发的问题。
 * 不一样的是，它是在内部类里面去创建对象实例。
 * 这样的话，只要应用中不使用内部类，JVM就不会去加载这个单例类，也就不会创建单例对象，从而实现懒汉式的延迟加载。
 * 也就是说这种方式可以同时保证延迟加载和线程安全。
 * 
 * @author Administrator
 *
 */
public class SingletonDemonC {

	// 构建私有内部静态类
	private static class provideInstance {
		public static final SingletonDemonC instance = new SingletonDemonC();
	}

	/*将构造方法私有化*/
    private SingletonDemonC() {
    }

    // 创建公有单例方法
	public static final SingletonDemonC getInstance() {
		// 调用内部静态类
		return provideInstance.instance;
	}
}
