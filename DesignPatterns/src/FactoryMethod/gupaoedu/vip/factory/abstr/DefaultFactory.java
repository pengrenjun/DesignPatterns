package FactoryMethod.gupaoedu.vip.factory.abstr;


import FactoryMethod.gupaoedu.vip.factory.Car;

public class DefaultFactory extends AbstractFactory {

	private AudiFactory defaultFactory = new AudiFactory();
	
	@Override
    public Car getCar() {
		return defaultFactory.getCar();
	}

}
