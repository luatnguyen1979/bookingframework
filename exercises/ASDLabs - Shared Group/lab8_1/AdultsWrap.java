package lab8_1;

public class AdultsWrap extends AdultsPackaging {

	@Override
	public double getCost() {
		System.out.println("Packing: AdultsWrap");
		return 2.0;
	}
}
