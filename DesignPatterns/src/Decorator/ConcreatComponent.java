package Decorator;


/**
 * @author Administrator
 *　具体构件角色
 * 定义一个将要接收附加责任的类
 */
public class ConcreatComponent implements Component {
    
	public String getMessage(String input) {
		
		return input;
	}

	
	
}
