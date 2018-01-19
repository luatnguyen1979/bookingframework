package usa.edu.mum.asd.labs.lab4.abstractfactory;

import java.util.LinkedList;
import java.util.List;

public class GiftPack {

    private List<GiftItem> giftItems;
    private Address shippingAddress;
    private String packType; //"Business", "Adults", or "Kids"
    private IFactory factory;

    public GiftPack(Address shippingAddress, String packType) {
        this.giftItems = new LinkedList<>();
        this.shippingAddress = shippingAddress;
        this.packType = packType;
        if ("Business".equals(packType)) {
            factory = new BusinessFactory();
        } else if ("Adults".equals(packType)) {
            factory = new AdultFactory();
        } else {
            factory = new KidFactory();
        }
    }

    public List<GiftItem> getGiftItems() {
        return giftItems;
    }

    public void addGiftItem(String description, String id, String name, String packagingType) {
        GiftItem giftItem = new GiftItem();
        giftItem.setDescription(description);
        giftItem.setGiftId(id);
        giftItem.setGiftName(name);
        giftItem.setPackagingType(packagingType);
        if ("bag".equals(packagingType)) {
            giftItem.setPackaging(factory.createBag());
        } else if ("box".equals(packagingType)) {
            giftItem.setPackaging(factory.createBox());
        } else {
            giftItem.setPackaging(factory.createWrap());
        }
        this.giftItems.add(giftItem);
    }

    public Float calculateCost() {
        Float totalAmount = 0F;
        for (GiftItem giftItem : giftItems) {
            totalAmount = totalAmount + giftItem.getPackaging().getCost();
        }
        return totalAmount;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public String getPackType() {
        return packType;
    }

}
