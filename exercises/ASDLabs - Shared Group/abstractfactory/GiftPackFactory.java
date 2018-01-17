package abstractfactory;

public class GiftPackFactory implements AbstractFactory{

	@Override
	public GiftPack createGiftPack(GiftPackType giftPacktype) {
		
		if(giftPacktype.equals(GiftPackType.Business)){
			return new BusinessGiftpack();
		}else if(giftPacktype.equals(GiftPackType.Adult)){
			return new AdultGiftpack();
		}else if(giftPacktype.equals(GiftPackType.Kids)){
			return new KidGiftpack();
		}
		
		return null;
	}

	@Override
	public Packaging createPackaging(GiftPackType giftPackType, PackagingType packagingType) {
		return null;
	}

	
}
