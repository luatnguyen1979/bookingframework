package lab8_1;

public class GiftItem {
	private String giftId;
	private String giftName;
	private String description;
	private String packagingType; // "bag", "box", or "wrap". Private Packaging
									// packaging; //…
	private Packaging packaging;

	public GiftItem(String giftId, String giftName, String description, String packagingType) {
		this.giftId = giftId;
		this.giftName = giftName;
		this.description = description;
		this.packagingType = packagingType;

	}

	public void createPackaging(String packType) {
		packaging = PackTypeFactory.getFactory(packType).createPackaging(packagingType);
	}

	public double getCost() {
		return packaging.getCost();
	}

}