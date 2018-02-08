package Decorator;


/**
 * @author Administrator
 * 装饰角色 持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。
 * 这个装饰角色可以不写的,直接具体化修饰过程
 * 这里写主要考虑到后面要构建许多装饰器,继承同一个装饰模式
 */
public class Decorator implements Component {

	  private Component component;
	  
	
	
	public Decorator(Component component) {
		super();
		this.component = component;
	}



	public String getMessage(String input) {
		
		
		return component.getMessage(input);
	}

}
