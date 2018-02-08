package ProtoType;

import java.sql.Date;

/**
 * @author Administrator
         创建一个工厂,用来提供各种日志模板,用来进行复制克隆
 *
 */
public class WeekLogMedalFactory {
	
	
	private static  WeekLogProtoType orgWeekLogProtoType=new WeekLogProtoType("用户名","内容",new Date(0));
	//提供类方法提供模板
	public static WeekLogProtoType provideWeekLogMedal(String type){
		
		if(type.equalsIgnoreCase("A")){
			return getMedalA("A");
		}
		if(type.equalsIgnoreCase("B")){
			return getMedalA("B");
		}
		if(type.equalsIgnoreCase("C")){
			return getMedalA("C");
		}
		
		return orgWeekLogProtoType;

	}
	
	//创建各种模板,供客户段程序进行使用
	private static WeekLogProtoType  getMedalA(String type){
		WeekLogProtoType weekLogProtoTypeMedal=orgWeekLogProtoType.Clone();
		if(type.equalsIgnoreCase("A")){
		weekLogProtoTypeMedal.setConcontl("这周完成开发进度");
		return weekLogProtoTypeMedal;}
		if(type.equalsIgnoreCase("B")){
			weekLogProtoTypeMedal.setConcontl("这周会议较多");
			return weekLogProtoTypeMedal;}
		if(type.equalsIgnoreCase("C")){
			weekLogProtoTypeMedal.setConcontl("这周工作任务量较大");
			return weekLogProtoTypeMedal;}
		return weekLogProtoTypeMedal;

	}
	
	
	
	
	
	
	
	

}
