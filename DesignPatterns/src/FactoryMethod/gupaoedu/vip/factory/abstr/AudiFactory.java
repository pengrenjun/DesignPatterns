package FactoryMethod.gupaoedu.vip.factory.abstr;


import FactoryMethod.gupaoedu.vip.factory.Audi;
import FactoryMethod.gupaoedu.vip.factory.Car;

//具体的业务逻辑封装
public class AudiFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
