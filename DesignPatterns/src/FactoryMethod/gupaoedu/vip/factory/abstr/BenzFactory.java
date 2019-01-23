package FactoryMethod.gupaoedu.vip.factory.abstr;


import FactoryMethod.gupaoedu.vip.factory.Benz;
import FactoryMethod.gupaoedu.vip.factory.Car;

public class BenzFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
