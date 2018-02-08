package Singleton;

/**
 * ��̬�ڲ��� ���ַ�ʽͬ������������ػ�������ֻ֤����һ��instanceʵ���� �������ģʽһ����Ҳ������������ػ��ƣ���˲����ڶ��̲߳��������⡣
 * ��һ�����ǣ��������ڲ�������ȥ��������ʵ����
 * �����Ļ���ֻҪӦ���в�ʹ���ڲ��࣬JVM�Ͳ���ȥ������������࣬Ҳ�Ͳ��ᴴ���������󣬴Ӷ�ʵ������ʽ���ӳټ��ء�
 * Ҳ����˵���ַ�ʽ����ͬʱ��֤�ӳټ��غ��̰߳�ȫ��
 * 
 * @author Administrator
 *
 */
public class SingletonDemonC {

	// ����˽���ڲ���̬��
	private static class provideInstance {
		public static SingletonDemonC instance = new SingletonDemonC();
	}

	// �������е�������
	public static SingletonDemonC getInstance() {
		// �����ڲ���̬��
		return provideInstance.instance;
	}
}