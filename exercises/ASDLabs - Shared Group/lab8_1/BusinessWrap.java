package lab8_1;

public class BusinessWrap extends BusinessPackaging {

	@Override
	public double getCost() {
		System.out.println("Packing: BusinessWrap");
		return 0.25;
	}
}
