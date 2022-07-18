package basics;

abstract class car {
	int price;
	abstract void start();
	
	void Breaks() {
		System.out.println("Car is breaking");
	}
}

class Audi extends car{

	@Override
	void start() {
		System.out.println("Audi is starting");
		
	}
	
}

class BMW extends car{

	@Override
	void start() {
		System.out.println("BMW is starting");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a1 = new Audi();
		a1.start();
		a1.Breaks();
	}

}
