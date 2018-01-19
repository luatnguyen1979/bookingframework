/**
 * 
 */
package asd.day4.lab52;

import java.util.Arrays;
import java.util.List;

import asd.day4.lab52.abstracts.AbstractBagPackaging;
import asd.day4.lab52.abstracts.AbstractBoxPackaging;
import asd.day4.lab52.abstracts.AbstractWrapPackaging;
import asd.day4.lab52.domains.Address;
import asd.day4.lab52.domains.GiftItem;
import asd.day4.lab52.domains.GiftPack;
import asd.day4.lab52.factories.FactoryProducer;
import asd.day4.lab52.factories.PackagingFactory;
import asd.day4.lab52.utils.AudianceType;
import asd.day4.lab52.utils.PackType;

/**
 * @author luatnguyen
 *
 */
public class PackagingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address addr1 = new Address("1302 S Main st", "", "Fairfield", "IA", "52556");
		Address addr2 = new Address("1000 N 4 st", "", "Fairfield", "IA", "52557");
		Address addr3 = new Address("1102 N Belairc blvd", "", "Toms River", "NJ", "07853");
		
		GiftItem item1 = new GiftItem("001", "iPhone 8", "Apple Cell Phone", PackType.Bag);
		GiftItem item2 = new GiftItem("002", "iPhone 8 Plus", "Apple Phablet", PackType.Box);
		GiftItem item3 = new GiftItem("003", "iPhone iPad", "Apple Tablet", PackType.Wrap);
		GiftItem item4 = new GiftItem("004", "iPhone iPad Mini", "Apple Cell Phone", PackType.Bag);
		GiftItem item5 = new GiftItem("005", "iPhone X", "Apple Cell Phone", PackType.Box);
		GiftItem item6 = new GiftItem("006", "iPhone X Plus", "Apple Cell Phone", PackType.Wrap);
		GiftItem item7 = new GiftItem("007", "Macbook Pro", "Apple Macbook Pro", PackType.Bag);
		GiftItem item8 = new GiftItem("008", "iMac", "Apple iMac", PackType.Box);
		GiftItem item9 = new GiftItem("009", "iMac Pro", "Apple iMac Pro", PackType.Wrap);
		
		GiftPack pack1 = new GiftPack(Arrays.asList(item1, item2, item3), addr1, AudianceType.Adult);
		GiftPack pack2 = new GiftPack(Arrays.asList(item4, item5, item6), addr2, AudianceType.Kid);
		GiftPack pack3 = new GiftPack(Arrays.asList(item7, item8, item9), addr3, AudianceType.Business);

		List<GiftPack> packs = Arrays.asList(pack1, pack2, pack3);
		
		for (GiftPack pack:packs) {
			for (GiftItem item : pack.getGiftItems()) {
				PackagingFactory packagingFac = FactoryProducer.getPackageFactory(pack.getPackType());
				PackType packType = item.getPackagingType();
				if (packType == PackType.Bag) {
					AbstractBagPackaging bagPackaging = packagingFac.createBag();
					item.setPackaging(bagPackaging);
				} else if (packType == PackType.Box) {
					AbstractBoxPackaging boxPackaging = packagingFac.createBox();
					item.setPackaging(boxPackaging);
				} else if (packType == PackType.Wrap) {
					AbstractWrapPackaging wrapPackaging = packagingFac.createWrap();
					item.setPackaging(wrapPackaging);
				} else {
					throw new UnsupportedOperationException("No support packaging type for " + item.getPackagingType());
				}
			}
		}
		
		//Output
		for (GiftPack pack : packs) {
			
			for (GiftItem item: pack.getGiftItems()) {
				System.out.println(item.getPackaging().toString() + " => " + item.getPackagingType() + " for " + pack.getPackType());
			}
		}
	}

}
