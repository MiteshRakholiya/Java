package Sec_6;

public class Switch_case_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x =3;
//		//char x = 'b';
//		
//		switch (x) {
//		case 1:
//			System.out.println("The value of x is 1");
//			break;
//			
//		case 2:
//			System.out.println("The value of x is 2");
//			break;
//			
//		case 3:
//			System.out.println("The value of x is 3");
//			break;
//
//		default:System.out.println("The value of x is other than 1,2,3");
//			break;
//		}
		
		String name ="IndiA";
		
		switch (name.toLowerCase()) {
		case "india":
			System.out.println("Best 20-20 team");
			break;
			
		case "australia":
			System.out.println("best 50 over team");
			break;
			
		case "sri lanka":
			System.out.println("Best Test Team");
			break;

		default:System.out.println("Invalid entry");
			break;
		}
	}

}
