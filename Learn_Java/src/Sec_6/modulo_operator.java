package Sec_6;

public class modulo_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * double x = 10.3%3; System.out.println(x);
		 */

		/*
		 * int x = 13; if(x%2 == 0) { System.out.println("Value is even"); } else {
		 * System.out.println("Value is odd"); }
		 */
	
		int value = 1234;
		int sumOfDigits=0;
		
		while(true) {
			sumOfDigits = sumOfDigits + value%10;
			value = value/10;
			if (value<10) {
				break;
			}
		}
		sumOfDigits = sumOfDigits+value; 
		System.out.println("Sum of Digit is: "+sumOfDigits);
		
	}

}
