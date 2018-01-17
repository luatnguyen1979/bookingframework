package abstractfactory;

public abstract interface AbstractFactory {

	public GiftPack createGiftPack(GiftPackType giftPacktype);
	public Packaging createPackaging(GiftPackType giftPackType,PackagingType packagingType);
}
