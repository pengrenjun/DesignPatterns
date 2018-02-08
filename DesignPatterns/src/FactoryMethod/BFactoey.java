package FactoryMethod;

//大工厂里边含有不同的小工厂
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
