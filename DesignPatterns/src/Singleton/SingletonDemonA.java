package Singleton;


/**
 * �̰߳�ȫ������ģʽ
 * ��������߳�ͬ������ �Ƕ�����ģʽ���Ż�
 * synchronized���ε�ͬ��������һ�㷽��Ҫ���ܶ࣬�����ε���getInstance()���ۻ���������ľͱȽϴ���
 * @author Administrator
 *
 */
public class SingletonDemonA {
   //����jvm����ʱ��������,�ǶԶ���ģʽ���Ż�,�������ڴ������
   private static SingletonDemonA instance=null;
   //����˽�еĹ��캯��,��ֹʵ������������
   private SingletonDemonA(){};
   
   //����ʵ����������,�õ�����,��������˶��߳�ͬʱ����getInstance()������
   public static synchronized SingletonDemonA getInstance(){
	   if(instance==null){
		   //����û�б�����
		   return new SingletonDemonA();
	   }
	   return instance;
   }

}
