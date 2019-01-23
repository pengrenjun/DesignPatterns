package FactoryMethod.gupaoedu.vip.factory.func;


import FactoryMethod.gupaoedu.vip.factory.Bmw;
import FactoryMethod.gupaoedu.vip.factory.Car;

public class BmwFactory implements Factory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
