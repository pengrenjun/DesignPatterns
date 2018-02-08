package Builder;

//汽车生产要按生产流程规范生产
public class CarA extends BuilderCar {
     
	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		carMedal.setColor("银色");
	}

	@Override
	public void setPrice() {
		// TODO Auto-generated method stub
		carMedal.setPrice("29852096232456");
	}

	

	
}
