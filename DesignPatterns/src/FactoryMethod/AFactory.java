package FactoryMethod;


//��������

public class AFactory {

	public AFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static final SendInterface produceSender(String type){
		
		if(type.equals("INFO")){
			return new InformationSender();
		}
		if(type.equals("MAIL")){
			return new MailSender();
		}
		
		System.out.println("��������Ͳ���ȷ");
		
		return null;
		

		
	}

}
