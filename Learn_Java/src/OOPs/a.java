package OOPs;

public class a {

	void showA() {
		System.out.println("A class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c ob1 = new c();
		ob1.showA();
		//ob1.showB();
		ob1.showC();
		System.out.println("*****************************");
		
		b ob2 = new b();
		ob2.showA();
		ob2.showB();
		System.out.println("*****************************");
		
		
		a ob3 = new a();
		ob3.showA();
		
	}

}

class b extends a{
	void showB() {
		System.out.println("B class method");
	}
	
}

class c extends a{
	void showC() {
		System.out.println("C class method");
	}
}