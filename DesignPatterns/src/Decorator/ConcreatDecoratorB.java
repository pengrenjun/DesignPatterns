package Decorator;

public class ConcreatDecoratorB extends Decorator {

	
	public ConcreatDecoratorB(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	//装饰方法(对原来功能的的修饰【扩展】)
	@Override
	public String getMessage(String input) {
		// TODO Auto-generated method stub
		String message=super.getMessage(input);
		if(message.length()>10){
			return message.concat("装饰器修饰");
		}
		return message;
		 
	}
}
