package Builder;

//��������Ӧ��������������ͺ�,��Ӧ�̽�������
public class Buyer {

	

    public static void main(String[] args) {
		
    	//�ҵ���Ӧ��
    	Supplier supplier=new Supplier();
    	
    	//��Ӧ���õ�����淶��������
    	supplier.setBuilderCar(new CarB());
    	
    	CarMedal car= supplier.build();
    	System.out.println(car.getColor()+" "+car.getPrice());
    	
	}
	
	
	
	
	
	
}
