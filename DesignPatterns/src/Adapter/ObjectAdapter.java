package Adapter;

/**
 * @author Administrator
 *对象适配器模式 ,并不继承source类,而是持有source类
 */
public class ObjectAdapter implements TargetInterface {
	
	private static Souce getSouce(){
		return new Souce();
	}
	
	@Override
	public String toUpper(String input) {
		// TODO Auto-generated method stub
		return getSouce().toUpper(input);
	}

	@Override
	public void soutStr(String str) {
		// TODO Auto-generated method stub
       System.out.println(str);
	}

}
