package FactoryMethod;

public class FactoryTest {

    /**
     * ������˵����������ģʽ�ʺϣ����ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ��
     * ����ͨ����������ģʽ���д����������ϵ�����ģʽ�У���һ�����������ַ������󣬲�����ȷ��������
     * ����������ڵڶ��֣�����Ҫʵ���������࣬���ԣ����������£����ǻ�ѡ�õ����֡�����̬��������ģʽ��
     * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ͨ����ģʽ
		//ͨ�����������ݲ�Ʒ����,����������������Ҫ����ʶ��,�ٵ��ò�Ʒ���������̽���������
		
		SendInterface informationSender=AFactory.produceSender("INFO");
		SendInterface MAILSender=AFactory.produceSender("MAIL");
		informationSender.send();
		MAILSender.send();
		
		//�๤��ģʽ  �󹤳���ߺ��в�ͬ��С���� (��̬��������ģʽ) ֱ�ӵ���
		BFactoey.getInfomationSeder().send();
		BFactoey.getMailSeder().send();
		

	}

}
