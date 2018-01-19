/**
 * 
 */
package asd.day4.lab52.domains;

import java.util.List;

import asd.day4.lab52.utils.AudianceType;

/**
 * @author luatnguyen
 *
 */
public class GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;
	private AudianceType packType; //"Business", "Adults", or "Kids"
	
	
	/**
	 * @param giftItems
	 * @param shippingAddress
	 * @param packType
	 */
	public GiftPack(List<GiftItem> giftItems, Address shippingAddress, AudianceType packType) {
		super();
		this.giftItems = giftItems;
		this.shippingAddress = shippingAddress;
		this.packType = packType;
	}
	/**
	 * @return the giftItems
	 */
	public List<GiftItem> getGiftItems() {
		return giftItems;
	}
	/**
	 * @param giftItems the giftItems to set
	 */
	public void setGiftItems(List<GiftItem> giftItems) {
		this.giftItems = giftItems;
	}
	/**
	 * @return the shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}
	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	/**
	 * @return the packType
	 */
	public AudianceType getPackType() {
		return packType;
	}
	/**
	 * @param packType the packType to set
	 */
	public void setPackType(AudianceType packType) {
		this.packType = packType;
	}
	
	
}
