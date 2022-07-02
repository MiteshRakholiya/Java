package Sec_7;

import java.security.PublicKey;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop1(1, 5);
		System.out.println("*********************************");
		loop1(11, 15);
		System.out.println("*********************************");
		loop1(6, 10);

//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("*********************");
//		int j = 20;
//		while (j <= 30) {
//			System.out.println(j);
//			j++;
//		}

	}

	public static void loop1(int step, int finalValue) {
		while (step <= finalValue) {
			System.out.println(step);
			step++;
		}

	}
	
	
//	public static void loop2() {
//		int j = 20;
//		while (j <= 30) {
//			System.out.println(j);
//			j++;
//		}
//	}
	 
}
