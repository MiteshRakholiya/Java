package basics;

interface bike{
	void start();
}

interface newPerson{
	void walk();
}

public class Interfaces implements bike, newPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		System.out.println("my car is starting");
	}

	@Override
	public void walk() {
		System.out.println("Person is walking");
	}

}
