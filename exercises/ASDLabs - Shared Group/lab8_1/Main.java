package lab8_1;

public class Main {
	public static void main(String[] args){
		
		Address dormAddress = new Address("1000 N 4th Street", "", "Fairfield", "Iowa", "52557");
		GiftItem item1 = new GiftItem("1", "Guitar", "Acoustic Guitar", "box");
		GiftItem item2 = new GiftItem("2", "Mobile", "Apple Phone", "wrap");
		GiftPack pack = new GiftPack(dormAddress, "Adults");
		
		pack.addGiftItem(item1);
		pack.addGiftItem(item2);
		
		System.out.println("Total Packing Cost: $"+pack.getCost());
	}
}
