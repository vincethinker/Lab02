
public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	public int qtyOrdered = 0;
	public Cart(double[] arr, DigitalVideoDisc[] itemOrdered) {
		super();
		this.itemOrdered = itemOrdered;
	}
	public Cart() {
		super();
		this.itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	}
	public DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public float totalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i ++) {
			sum += itemOrdered[i].getCost();
		}
		return sum;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED)
		{
			System.out.println("The cart is almost full");
			return;
		}
		else if (qtyOrdered < MAX_NUMBERS_ORDERED)
		{			
			itemOrdered[qtyOrdered] = dvd;
			System.out.println("The disc has been added");
			qtyOrdered ++;
			return;
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int id= 0;
		for (int i = 0; i < qtyOrdered; i ++) {
			if (itemOrdered[i].equals(disc)) {
				id = i;
			}
		}
		qtyOrdered --;
		for (int i = id; i <qtyOrdered; i++) {
			itemOrdered[i] = itemOrdered[i+1];
		}
	}
}
