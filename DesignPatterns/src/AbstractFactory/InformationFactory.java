package AbstractFactory;

public class InformationFactory implements Provider{

	public  InformationSender provideFactory() {
		// TODO Auto-generated method stub
		return new InformationSender();	
	}


}
