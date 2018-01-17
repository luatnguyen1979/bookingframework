package lab8_1;

public class BusinessBox extends BusinessPackaging{

	@Override
	public double getCost() {
		System.out.println("Packing: BusinessBox");
		return 3;
	}

}
