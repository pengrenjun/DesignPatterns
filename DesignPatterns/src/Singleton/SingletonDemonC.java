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
		public static final SingletonDemonC instance = new SingletonDemonC();
	}

	/*�����췽��˽�л�*/
    private SingletonDemonC() {
    }

    // �������е�������
	public static final SingletonDemonC getInstance() {
		// �����ڲ���̬��
		return provideInstance.instance;
	}
}
