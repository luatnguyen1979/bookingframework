package lab8_1;

public class PackTypeFactory {
	public static PackagingFactory getFactory(String packType) {
		if (packType == "Business") {
			return new BusinessFactory();
		} else if (packType == "Adults") {
			return new AdultsFactory();
		} else
			return new KidsFactory();
	}
}
