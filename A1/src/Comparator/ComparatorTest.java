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
		System.out.println("����̳�comparable�ӿ�==================================================");
		TbUser user1=new TbUser();
		TbUser user2=new TbUser();
		
		user1.setEmail("qweasdcssfgs@qq.com");
		user2.setEmail("qweasdcssfgs@qq.com");

		System.out.println(user1.equals(user2));
		
		System.out.println(user1.hashCode()+" "+user2.hashCode());
		
		System.out.println("�����ͺ����͵ıȽ�==================================================");
		
		Float f1=(float) 12.3;
		Float f2=(float) 12.3;
		
		int int1=1;
		int int2=1;
		//�����͵ıȽϷ���,������ʵ����compare�ӿ�
		System.out.println(f1.equals(f2));
		System.out.println(f1.compareTo(f2));
		//�����͵ıȽϲ���==
		System.out.println(f1==f2);
		//����int ����ʹ��==���бȽ�
		System.out.println(int1==int2);
		
		
		Integer a =1;
		
		
		

	}

}
