package lab8_1;

import java.util.ArrayList;
import java.util.List;

public class GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;
	private String packType; // "Business", "Adults", or "Kids" //…

	public GiftPack(Address shippingAddress, String packType) {
		this.giftItems = new ArrayList<>();
		this.shippingAddress = shippingAddress;
		this.setPackType(packType);

	}

	public double getCost() {
		float cost = 0;
		for (GiftItem item : giftItems) {
			cost += item.getCost();
		}
		return cost;
	}

	public void addGiftItem(GiftItem item) {
		item.createPackaging(packType);
		giftItems.add(item);
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}
}
