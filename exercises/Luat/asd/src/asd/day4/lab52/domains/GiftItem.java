/**
 * 
 */
package asd.day4.lab52.domains;

import asd.day4.lab52.abstracts.Packaging;
import asd.day4.lab52.utils.PackType;

/**
 * @author luatnguyen
 *
 */
public class GiftItem {
	private String giftId;
	private String giftName;
	private String description;
	private PackType packagingType; //"bag", "box", or "wrap".
	private Packaging packaging;
	
	
	public GiftItem(String giftId, String giftName, String description, PackType packagingType) {
		super();
		this.giftId = giftId;
		this.giftName = giftName;
		this.description = description;
		this.packagingType = packagingType;
	}
	/**
	 * @return the giftId
	 */
	public String getGiftId() {
		return giftId;
	}
	/**
	 * @param giftId the giftId to set
	 */
	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}
	/**
	 * @return the giftName
	 */
	public String getGiftName() {
		return giftName;
	}
	/**
	 * @param giftName the giftName to set
	 */
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the packagingType
	 */
	public PackType getPackagingType() {
		return packagingType;
	}
	/**
	 * @param packagingType the packagingType to set
	 */
	public void setPackagingType(PackType packagingType) {
		this.packagingType = packagingType;
	}
	/**
	 * @return the packaging
	 */
	public Packaging getPackaging() {
		return packaging;
	}
	/**
	 * @param packaging the packaging to set
	 */
	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}
	
	
}
