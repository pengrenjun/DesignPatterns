package Builder;

//汽车生产流程
public abstract class BuilderCar {
   
	//定义汽车模型
	CarMedal carMedal=new CarMedal();
	
	//提出生产规范方法
	public abstract void setColor();
	public abstract void setPrice();
	
	//生产汽车
	public 	CarMedal getCar(){
		return carMedal;
	}
	
	
}
