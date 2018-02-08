package AbstractFactory;

//用来提供工厂的（工厂分开创建,创建时要实现这个接口(相当于注册),根据市场需要调用这个接口提供工厂来进行生产）
public interface Provider {

	public  SendInterface provideFactory() ;

}
