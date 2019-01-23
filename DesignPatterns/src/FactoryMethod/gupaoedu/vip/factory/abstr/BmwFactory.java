package FactoryMethod.gupaoedu.vip.factory.abstr;


import FactoryMethod.gupaoedu.vip.factory.Bmw;
import FactoryMethod.gupaoedu.vip.factory.Car;

public class BmwFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
