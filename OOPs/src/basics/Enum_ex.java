package basics;

public class Enum_ex {
	
	enum season  {WINTER,SUMMER,FALL,RAIN }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int learning = 8;
//		switch (learning) {
//		case COLLECCTION:
//			System.out.println("Step 2 : Learning framework collection");
//			break;
//		case COREJAVA:
//			System.out.println("Step = 1 : Learning core java");
//			break;
//		case MULTITHREADING:
//			System.out.println("Step 4 : Learning Multithreading");
//			break;
//
//		case GENERICS:
//			System.out.println("Step 3 : Learning Generics");
//			break;
//		default:
//			System.out.println("Not a valid no.");
//		}

		Enum e = Enum.COREJAVA;
		switch (e) {
		case COLLECCTION:
			System.out.println("Step 2 : Learning framework collection");
			break;
		case COREJAVA:
			System.out.println("Step = 1 : Learning core java");
			break;
		case GENERICS:
			System.out.println("Step 3 : Learning Generics");
			break;
		case MULTITHREADING:
			System.out.println("Step 4 : Learning Multithreading");
			break;
		default:
			System.out.println("Element not in the enum list");
			break;
		}

		season s = season.SUMMER;
		System.out.println(s);
	}
}
