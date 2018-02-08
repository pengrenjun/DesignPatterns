package Builder;

//购买者向供应商提出具体汽车型号,供应商进行生产
public class Buyer {

	

    public static void main(String[] args) {
		
    	//找到供应商
    	Supplier supplier=new Supplier();
    	
    	//供应商拿到具体规范进行生产
    	supplier.setBuilderCar(new CarB());
    	
    	CarMedal car= supplier.build();
    	System.out.println(car.getColor()+" "+car.getPrice());
    	
	}
	
	
	
	
	
	
}
