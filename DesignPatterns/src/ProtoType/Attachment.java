package ProtoType;

import java.io.Serializable;

//附件类
public class Attachment implements Serializable {

	private String attachName;
	private String filePath;
	
	public Attachment(String attachName, String filePath) {
		super();
		this.attachName = attachName;
		this.filePath = filePath;
	}
	public String getAttachName() {
		return attachName;
	}
	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	

}
