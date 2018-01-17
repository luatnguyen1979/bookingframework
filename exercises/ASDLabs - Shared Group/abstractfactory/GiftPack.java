package abstractfactory;

import java.util.List;

import cor.Address;

public abstract class GiftPack {
	
	protected GiftPackType packType; //"Business", "Adults", or "Kids"
	
	protected List<GiftItem> giftItems;
	protected Address shippingAddress;
	
	abstract void addGiftItem(GiftItem item);
	
	/*public GiftPack(Address shippingAddress, GiftPackType packType) {
		super();
		this.shippingAddress = shippingAddress;
		this.packType = packType;
	}*/
	public List<GiftItem> getGiftItems() {
		return giftItems;
	}
	public void setGiftItems(List<GiftItem> giftItems) {
		this.giftItems = giftItems;
	}
	public GiftPackType getPackType() {
		return packType;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	
	
	
	
}
