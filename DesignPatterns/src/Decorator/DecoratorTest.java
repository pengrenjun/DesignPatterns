package Decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		
		
		ConcreatComponent component=new ConcreatComponent();
		System.out.println(component.getMessage("asd"));
		
		System.out.println(new ConcreteDecoratorA(component).getMessage("fhajkdhfajksdhfjkadfj"));
		System.out.println(new ConcreatDecoratorB(component).getMessage("fhajkdhfajksdhfjkadfj"));

		
		
		
		
	}

}
