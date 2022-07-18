package basics;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Hey there, "+age+" Have a nice day");
		sc.close();
		
	}

}
