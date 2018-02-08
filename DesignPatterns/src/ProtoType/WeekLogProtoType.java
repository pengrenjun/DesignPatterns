package ProtoType;

import java.sql.Date;
import java.util.List;

/**
 * @author Administrator
 *周报的原型模式,通过继承cloneable接口，其他的实例可以通过克隆产生新的对象(浅克隆)
 */
public class WeekLogProtoType implements Cloneable {
	
	public WeekLogProtoType(String name, String concontl, Date glDate) {
		super();
		this.name = name;
		this.concontl = concontl;
		this.glDate = glDate;
	}
    
	//基本内容(基本)
	private String name;
	private String concontl;
	private Date glDate;
	
	//附件内容(引用类型)
	 private List<Attachment> attachMentList;
	 

	public List<Attachment> getAttachMentList() {
		return attachMentList;
	}
	public void setAttachMentList(List<Attachment> attachMentList) {
		this.attachMentList = attachMentList;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConcontl() {
		return concontl;
	}
	public void setConcontl(String concontl) {
		this.concontl = concontl;
	}
	public Date getGlDate() {
		return glDate;
	}
	public void setGlDate(Date glDate) {
		this.glDate = glDate;
	}
	
//   需要填写clone的方法,方法名自定义,主要通过super.clone的方法进行对象的克隆
	public  WeekLogProtoType  Clone(){
		  Object weekLogClone=null;
		try {
			 weekLogClone=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (WeekLogProtoType) weekLogClone;

	}
	
	
	

}
