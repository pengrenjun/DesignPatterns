package Facad;
//外观类,将读取文件,加密处理,保存加密文件流程统一
public class FacadClass {

	
	ReadOriDoc readOriDoc =new ReadOriDoc();
	CodeProduce codeProduce=new CodeProduce();
    SavaCodeDoc savaCodeDoc=new SavaCodeDoc();
    
    public void docCodepro(){
    	
    	readOriDoc.readOriDoc();
    	codeProduce.CodeProduce();
    	savaCodeDoc.savaCodeDoc();
    }
}
