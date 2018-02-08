package Decorator;




/**
 * @author Administrator
 *　具体装饰角色 负责给构件对象“贴上”附加的责任。
 */
public class ConcreteDecoratorA extends Decorator {
	
	//这个构造器很关键,它接受被修饰的对象,对其进行了修饰

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
    
	//装饰方法(对原来功能的的修饰【扩展】)
	@Override
	public String getMessage(String input) {
		// TODO Auto-generated method stub
		String message=super.getMessage(input);
		if(message.length()>10){
			return message.toUpperCase();
		}
		return message;
		 
	}
	

}
