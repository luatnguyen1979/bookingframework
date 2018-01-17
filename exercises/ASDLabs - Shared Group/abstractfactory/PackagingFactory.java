package abstractfactory;

import abstractfactory.packaging.Cartoon;
import abstractfactory.packaging.EverydayValue;
import abstractfactory.packaging.HappyKid;
import abstractfactory.packaging.HardPlastic;
import abstractfactory.packaging.HolidaySurprise;
import abstractfactory.packaging.MerchantCollection;
import abstractfactory.packaging.Micky;
import abstractfactory.packaging.PlainPaper;
import abstractfactory.packaging.ResusableShopper;

public  class PackagingFactory implements AbstractFactory{


	@Override
	public GiftPack createGiftPack(GiftPackType giftPacktype) {
		return null;
	}

	@Override
	public Packaging createPackaging(GiftPackType giftPackType, PackagingType packagingType) {
		if(giftPackType.equals(GiftPackType.Business) && packagingType.equals(PackagingType.Bag)){
			return new MerchantCollection();
		}else if(giftPackType.equals(GiftPackType.Business) && packagingType.equals(PackagingType.Box)){
			return new HardPlastic();
		}else if(giftPackType.equals(GiftPackType.Business) && packagingType.equals(PackagingType.Wrap)){
			return new HolidaySurprise();
		}else if(giftPackType.equals(GiftPackType.Adult) && packagingType.equals(PackagingType.Bag)){
			return new ResusableShopper();
		}else if(giftPackType.equals(GiftPackType.Adult) && packagingType.equals(PackagingType.Box)){
			return new PlainPaper();
		}else if(giftPackType.equals(GiftPackType.Adult) && packagingType.equals(PackagingType.Wrap)){
			return new EverydayValue();
		}else if(giftPackType.equals(GiftPackType.Kids) && packagingType.equals(PackagingType.Bag)){
			return new Micky();
		}else if(giftPackType.equals(GiftPackType.Kids) && packagingType.equals(PackagingType.Box)){
			return new Cartoon();
		}else if(giftPackType.equals(GiftPackType.Kids) && packagingType.equals(PackagingType.Wrap)){
			return new HappyKid();
		}
		return null;
	}
	
}
