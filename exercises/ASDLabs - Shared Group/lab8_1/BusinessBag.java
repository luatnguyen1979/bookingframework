package lab8_1;

public class BusinessBag extends BusinessPackaging {

	@Override
	public double getCost() {
		System.out.println("Packing: BusinessBag");
		return 0.5;
	}

}
