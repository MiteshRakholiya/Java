package Sec_7;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of a rectangle:" +area(15.15d, 5.25d));
		System.out.println("Area of a square:" +area(5.0d));
		System.out.println("Area of a square:" +area(5));
	}

	public static double area(double length, double width) {
		return length*width;
	}

	public static double area(double side) {
		return side*side;
	}

	
	public static int area(int side) {
		return side*side;
	}


	
}
