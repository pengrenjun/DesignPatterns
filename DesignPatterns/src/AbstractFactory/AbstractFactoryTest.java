package AbstractFactory;



public class AbstractFactoryTest {

	/**
	 * ��������ģʽ��һ��������ǣ���Ĵ������������࣬Ҳ����˵�������Ҫ��չ���򣬱���Թ���������޸ģ���Υ���˱հ�ԭ��
	 * ���ԣ�����ƽǶȿ��ǣ���һ�������⣬��ν����
	 * ���õ� ���󹤳�ģʽ��������������࣬
	 * ����һ����Ҫ�����µĹ��ܣ�ֱ�������µĹ�����Ϳ����ˣ�����Ҫ�޸�֮ǰ�Ĵ��롣
	 * 
	 * 
	 * ��ʵ���ģʽ�ĺô����ǣ����������������һ�����ܣ�����ʱ��Ϣ����ֻ����һ��ʵ���࣬ʵ��Sender�ӿڣ�
	 * ͬʱ��һ�������࣬ʵ��Provider�ӿڣ���OK�ˣ�����ȥ�Ķ��ֳɵĴ��롣����������չ�ԽϺã�
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ҫ��Ʒ,��ע���ѯ�ʹ�������Ϣ,������
	    //ע����ṩ����
		Provider infomationFactory=new InformationFactory();
		infomationFactory.provideFactory().send();
	}

}
