public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star World", "Fiction", "Le Thanh Vinh", 21,  99.99f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Arcane", "Animation", "Riot", 40,  15.59f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Sword Art Online", "Animation", "Le Thanh Vinh", 25,  13.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Mummy", "Action", "Stephen Sommers", 120,  29.99f);
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd5);

		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println(anOrder.qtyOrdered);
		for (int i = 0; i < anOrder.qtyOrdered; i++) {
			System.out.println(anOrder.itemOrdered[i].getTitle());
		}
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}

}
