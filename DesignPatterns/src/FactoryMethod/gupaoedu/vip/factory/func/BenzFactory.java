package FactoryMethod.gupaoedu.vip.factory.func;


import FactoryMethod.gupaoedu.vip.factory.Benz;
import FactoryMethod.gupaoedu.vip.factory.Car;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
