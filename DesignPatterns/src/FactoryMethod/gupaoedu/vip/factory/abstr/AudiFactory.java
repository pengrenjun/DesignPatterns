package FactoryMethod.gupaoedu.vip.factory.abstr;


import FactoryMethod.gupaoedu.vip.factory.Audi;
import FactoryMethod.gupaoedu.vip.factory.Car;

//�����ҵ���߼���װ
public class AudiFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
