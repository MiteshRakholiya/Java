package Sec_16;

interface Lamda1{
	public void demo1();
}
public class lamda_overview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamda1 lamda = () -> {
			System.out.println("Statment 1");
			System.out.println("Statment 2");
			System.out.println("Statment 3");
			};
		lamda.demo1();
	}

}
