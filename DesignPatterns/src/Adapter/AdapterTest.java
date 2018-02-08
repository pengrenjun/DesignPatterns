package Adapter;

import java.util.List;

public class AdapterTest {
	
	public static void main(String[] args) {
		//类的适配器
		TargetInterface target=new ClassAdapter();
		target.soutStr("类的适配器功能");
		
	    //对象适配器
		TargetInterface objtarget=new ObjectAdapter();
		System.out.println(objtarget.toUpper("str"));
		objtarget.soutStr("对象适配器");
		
		//接口适配器
		InterfaceAdapterImplentsClass<String>  list=new InterfaceAdapterImplentsClass<String>();
		
		list.add("接口适配器");
		System.out.println(list.size());
		
	}

}
