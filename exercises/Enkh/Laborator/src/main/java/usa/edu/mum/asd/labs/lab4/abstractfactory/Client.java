package usa.edu.mum.asd.labs.lab4.abstractfactory;

public class Client {

    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Fairfield");
        address.setState("Iowa");
        address.setStreet1("2000 North Court Street");
        address.setStreet2("16C");

        GiftPack giftPack = new GiftPack(address, "Business");
        giftPack.addGiftItem("Car1 with motor", "1", "car1", "bag");
        giftPack.addGiftItem("Car2 with motor", "2", "car2", "box");
        giftPack.addGiftItem("Car3 with motor", "3", "car3", "wrap");
        System.out.println(giftPack.calculateCost());
        GiftPack giftPack1 = new GiftPack(address, "Adults");
        giftPack1.addGiftItem("NBA Ticket1", "1", "ticket1", "bag");
        giftPack1.addGiftItem("NBA Ticket2", "2", "ticket2", "box");
        giftPack1.addGiftItem("NBA Ticket3", "3", "ticket3", "wrap");
        System.out.println(giftPack1.calculateCost());
        GiftPack giftPack2 = new GiftPack(address, "Kids");
        giftPack2.addGiftItem("Toy1", "1", "toy1", "bag");
        giftPack2.addGiftItem("Toy2", "2", "toy2", "box");
        giftPack2.addGiftItem("Toy3", "3", "toy3", "wrap");
        System.out.println(giftPack2.calculateCost());
    }
}
