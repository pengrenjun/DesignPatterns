package Builder;

//��Ӧ��(���������ͺŽ�������,�������ṩ����)
public class Supplier {
	
	//Ҫ������ͳһ�����̹淶
	private BuilderCar builderCar;
    
	//ͨ��set���������̹淶ϸ��,����ĳһ�ͺ�����������
	public void setBuilderCar(BuilderCar builderCar) {
		this.builderCar = builderCar;
	}
	
	//���������ͺŵ�����
	public CarMedal build(){
		builderCar.setColor();
		builderCar.setPrice();
		return builderCar.getCar();
	}
	
	
	

}