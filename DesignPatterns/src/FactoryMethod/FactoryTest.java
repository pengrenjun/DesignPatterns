package FactoryMethod;

public class FactoryTest {

    /**
     * 总体来说，工厂方法模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，
     * 可以通过工厂方法模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，
     * 第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
     * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//普通工厂模式
		//通过给工厂传递产品类型,进行生产（工厂需要进行识别,再调用产品的生产流程进行生产）
		
		SendInterface informationSender=AFactory.produceSender("INFO");
		SendInterface MAILSender=AFactory.produceSender("MAIL");
		informationSender.send();
		MAILSender.send();
		
		//多工产模式  大工厂里边含有不同的小工厂 (静态工厂方法模式) 直接调用
		BFactoey.getInfomationSeder().send();
		BFactoey.getMailSeder().send();
		

	}

}
