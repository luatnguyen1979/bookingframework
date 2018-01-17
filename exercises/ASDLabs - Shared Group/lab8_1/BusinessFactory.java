package lab8_1;

public class BusinessFactory extends PackagingFactory {

	@Override
	public BusinessPackaging createPackaging(String packType) {
		if (packType == "bag")
			return new BusinessBag();
		else if (packType == "box")
			return new BusinessBox();
		else
			return new BusinessWrap();
	}

}
