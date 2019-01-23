package FactoryMethod.gupaoedu.vip.factory.func;


import FactoryMethod.gupaoedu.vip.factory.Audi;
import FactoryMethod.gupaoedu.vip.factory.Car;

public class AudiFactory implements Factory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
