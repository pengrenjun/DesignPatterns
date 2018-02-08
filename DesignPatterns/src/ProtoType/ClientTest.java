package ProtoType;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

//客户端测试
public class ClientTest {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		System.out.println("浅克隆==========================================================");
		// TODO Auto-generated method stub
//	      通过已创建的工作周报可以快速创建新的周报，然后再根据需要修改周报，无须再从头开始创建。原型模式为工作流系统中任务单的快速生成提供了一种解决方案。
		WeekLogProtoType weeklogA=WeekLogMedalFactory.provideWeekLogMedal("A");
		weeklogA.setName("小明");
		System.out.println(weeklogA.getConcontl()+" "+weeklogA.getName());
		
		WeekLogProtoType weeklogB=WeekLogMedalFactory.provideWeekLogMedal("B");
		weeklogB.setName("小李");
		System.out.println(weeklogB.getConcontl()+" "+weeklogB.getName());
		
		//浅克隆 引用类型指向同一个内存区域
		System.out.println(weeklogA==weeklogB);
		System.out.println(weeklogA.getAttachMentList()==weeklogB.getAttachMentList());
		
		
		System.out.println("深度克隆=========================================================");
		
		Attachment attachmenta=new Attachment("附件1", "/d:");
		List<Attachment> lista=Lists.newArrayList();
		lista.add(attachmenta);
		
		WeekLogPrototypeDeep weeklogDa=new WeekLogPrototypeDeep("用户1","测试内容",new Date(0),lista);
		
		
		WeekLogPrototypeDeep weeklogDb=weeklogDa.deepClone();
		System.out.println(JSON.toJSONString(weeklogDa));
		System.out.println(weeklogDa==weeklogDb);
		//引用类型也进行了克隆
		//深克隆技术实现了原型对象和克隆对象的完全独立，对任意克隆对象的修改都不会给其他对象产生影响，是一种更为理想的克隆实现方式。
		System.out.println(weeklogDa.getAttachMentList()==weeklogDb.getAttachMentList());
		
	   
	}

}
