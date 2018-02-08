package ProtoType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * @author Administrator
 *对象实现Serializable 接口,通过序列化的操作,通过编写流的操作方法,实现深度克隆
 */
public class WeekLogPrototypeDeep  implements Serializable {

	    
	//基本内容(基本)
	private String name;
	private String concontl;
	private Date glDate;
	
	//附件内容(引用类型)
	 private List<Attachment> attachMentList;
	 
	 
	 

	public WeekLogPrototypeDeep(String name, String concontl, Date glDate, List<Attachment> attachMentList) {
		super();
		this.name = name;
		this.concontl = concontl;
		this.glDate = glDate;
		this.attachMentList = attachMentList;
	}
	
	
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
	
//   通过编写流的操作方法进行对象的深度克隆
	public  WeekLogPrototypeDeep  deepClone() throws IOException, ClassNotFoundException{
		
		//将对象写入流中

        ByteArrayOutputStream bao=new  ByteArrayOutputStream();

        ObjectOutputStream oos=new  ObjectOutputStream(bao);

        oos.writeObject(this);

        //将对象从流中取出

        ByteArrayInputStream bis=new  ByteArrayInputStream(bao.toByteArray());

        ObjectInputStream ois=new  ObjectInputStream(bis);

        return  (WeekLogPrototypeDeep)ois.readObject();

	}
	
}
