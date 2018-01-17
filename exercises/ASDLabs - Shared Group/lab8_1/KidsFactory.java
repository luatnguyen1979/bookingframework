package lab8_1;

public class KidsFactory extends PackagingFactory {

	@Override
	public KidsPackaging createPackaging(String packType) {
		if (packType == "bag")
			return new KidsBag();
		else if (packType == "box")
			return new KidsBox();
		else
			return new KidsWrap();
	}
}
