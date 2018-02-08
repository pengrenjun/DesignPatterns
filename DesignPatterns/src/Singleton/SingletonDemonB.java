package Singleton;

/**
 * 双重校验锁 是对SingletonDemonA在性能上的优化
 * 
 * @author Administrator
 *
 */
public class SingletonDemonB {

	private static SingletonDemonB instance = null;

	private SingletonDemonB() {
	};

	/**
	 * 假如两个线程A、B，A执行了if (instance == null)语句，它会认为单例对象没有创建，
	 * 此时线程切到B也执行了同样的语句，B也认为单例对象没有创建，然后两个线程依次执行同步代码块，并分别创建了一个单例对象。
	 * 为了解决这个问题，还需要在同步代码块中增加if (instance == null)语句
	 */
	public static SingletonDemonB getInstance() {

		if (instance == null) {
			synchronized (SingletonDemonB.class) {
				if (instance == null) {
					return new SingletonDemonB();
				}
			}
		}
		return instance;
	}
}
