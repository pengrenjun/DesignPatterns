package FactoryMethod;

//�󹤳���ߺ��в�ͬ��С����
public class BFactoey {

	public BFactoey() {
		// TODO Auto-generated constructor stub
	}
	
	public static final SendInterface  getInfomationSeder(){
		 return new InformationSender();
	}
	
	public static final SendInterface  getMailSeder(){
		 return new MailSender();
	}

}
