package lab8_1;

public class AdultsBag extends AdultsPackaging{

	@Override
	public double getCost() {
		System.out.println("Packing: AdultsBag");
		return 10;
	}
}
