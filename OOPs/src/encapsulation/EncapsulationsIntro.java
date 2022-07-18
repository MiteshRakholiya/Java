package encapsulation;

class Laptop {
	int ram;
	private int price;

	public void setPrice(int price) {
		boolean Admin = true ;
		if (!Admin) {
			System.out.println("Can not set the price");
		} else {
			this.price = price;
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	
	 
}

public class EncapsulationsIntro {

//	public void doWork() {
//		System.out.println("Working");
//	}
//	
//	private void doWork() {
//		System.out.println("Working");
//	}

	public static void main(String[] args) {

		Laptop l1 = new Laptop();
		// l1.price = 25;
		l1.setPrice(29);
		System.out.println(l1.getPrice());
	}

}
