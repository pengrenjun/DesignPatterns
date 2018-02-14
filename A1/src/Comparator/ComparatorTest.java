package Comparator;


import java.math.BigDecimal;

import POJO.TbUser;

public class ComparatorTest {

	public ComparatorTest() {
		// TODO Auto-generated constructor stub
	}
                                                       
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("对象继承comparable接口==================================================");
		TbUser user1=new TbUser();
		TbUser user2=new TbUser();
		
		user1.setEmail("qweasdcssfgs@qq.com");
		user2.setEmail("qweasdcssfgs@qq.com");

		System.out.println(user1.equals(user2));
		
		System.out.println(user1.hashCode()+" "+user2.hashCode());
		
		System.out.println("浮点型和整型的比较==================================================");
		
		Float f1=(float) 12.3;
		Float f2=(float) 12.3;
		
		int int1=1;
		int int2=1;
		//浮点型的比较方法,浮点型实现了compare接口
		System.out.println(f1.equals(f2));
		System.out.println(f1.compareTo(f2));
		//浮点型的比较不用==
		System.out.println(f1==f2);
		//整型int 可以使用==进行比较
		System.out.println(int1==int2);
		
		
		Integer a =1;
		
		
		

	}

}
