package polymorphism;

public class Numbers {

	int sum (int a, int b) {
		return a+b;		
	}

	int sum (int a, int b, int c) {
		return a+b+c;		
	}
	
	String sum (int a, String b) {
		return a+b;		
	}

	public static void main(String[] args) {
		Numbers num = new Numbers();
		System.out.println(num.sum(1,2));
		System.out.println(num.sum(1,2,3));
		System.out.println(num.sum(1," Mitesh"));
	}
}
