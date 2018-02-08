package Singleton;

/**
 * ˫��У���� �Ƕ�SingletonDemonA�������ϵ��Ż�
 * 
 * @author Administrator
 *
 */
public class SingletonDemonB {

	private static SingletonDemonB instance = null;

	private SingletonDemonB() {
	};

	/**
	 * ���������߳�A��B��Aִ����if (instance == null)��䣬������Ϊ��������û�д�����
	 * ��ʱ�߳��е�BҲִ����ͬ������䣬BҲ��Ϊ��������û�д�����Ȼ�������߳�����ִ��ͬ������飬���ֱ𴴽���һ����������
	 * Ϊ�˽��������⣬����Ҫ��ͬ�������������if (instance == null)���
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
