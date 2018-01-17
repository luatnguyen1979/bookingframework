package lab8_1;

public class AdultsBox extends AdultsPackaging {

	@Override
	public double getCost() {
		System.out.println("Packing: AdultsBox");
		return 5.0;
	}

}
