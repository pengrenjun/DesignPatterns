package Builder;

//������������
public abstract class BuilderCar {
   
	//��������ģ��
	CarMedal carMedal=new CarMedal();
	
	//��������淶����
	public abstract void setColor();
	public abstract void setPrice();
	
	//��������
	public 	CarMedal getCar(){
		return carMedal;
	}
	
	
}
