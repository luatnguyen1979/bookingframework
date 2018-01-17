package lab8_1;

public class AdultsFactory extends PackagingFactory {

	@Override
	public AdultsPackaging createPackaging(String packType) {
		if (packType == "bag")
			return new AdultsBag();
		else if (packType == "box")
			return new AdultsBox();
		else
			return new AdultsWrap();
	}
}
