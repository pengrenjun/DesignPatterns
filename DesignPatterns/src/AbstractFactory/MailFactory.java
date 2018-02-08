package AbstractFactory;

public class MailFactory implements Provider {

	public  MailSender provideFactory() {
		// TODO Auto-generated method stub
		return new MailSender();	
	}
}
