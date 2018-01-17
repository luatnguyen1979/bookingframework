package abstractfactory;

import cor.Address;

public class Main {

	public static void main(String[] args){
		// getPackagingFactory.getpackaging(string packaging type).getcost
		
		//getbusinessgiftpack
		
		
		Address mumAdress = new Address("1000 N 4th St.", "Fairfield", "IA", "52557");
		Address address2 = new Address("855 N 2nd St.", "Fairfield", "IA", "52557");
		
		
		
//		GiftPack giftPack = new GiftPack(mumAdress,GiftPackType.Business);
		
		AbstractFactory abstractFactory = new GiftPackFactory();
		AbstractFactory packageAbstractFactory = new PackagingFactory();
		
		GiftPack businessGiftPack = abstractFactory.createGiftPack(GiftPackType.Business);
		//create new item with a bag packaging 

		
		GiftItem giftItem = new GiftItem("1","Item1","description");
		giftItem.setPackaging(packageAbstractFactory.createPackaging(GiftPackType.Business, PackagingType.Bag));
		
		
		businessGiftPack.addGiftItem(giftItem);
		
	}
}
