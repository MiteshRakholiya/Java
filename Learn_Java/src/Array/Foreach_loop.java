package Array;

public class Foreach_loop {
	public static void main(String[] args) {

		String[] stringArray = { "Mitesh", "Prashant", "Mehul", "Meraj", "Rahul" };

//		for (int i = 0; i <= 4; i++) {
//			System.out.println(stringArray[i]);
//		}


//		System.out.println(stringArray.length);
		
		for (String name : stringArray) {
			System.out.println(name);
		}
	}

}
