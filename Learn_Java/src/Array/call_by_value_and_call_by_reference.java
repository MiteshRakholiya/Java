package Array;

public class call_by_value_and_call_by_reference {
	public static void main(String[] args) {

 //Call by value
//		int value = 10;
//		System.out.println("Current value in main : "+value);
//		call_by_value_and_call_by_reference app = new call_by_value_and_call_by_reference();
//		app.displayValue(value);
//		System.out.println("Current value in main method: "+value);
//	}
//	
//	void displayValue(int value) {
//		System.out.println("Current value in displayValue method: "+value );
//		value = 20;
//		System.out.println("Current value in displayValue method: "+value );
//	}

// Call by reference		
		String[] names = { "Mitesh", "Prashant", "Mehul", "Meraj", "Rahul" };
		call_by_value_and_call_by_reference app = new call_by_value_and_call_by_reference();
		app.displayNames(names);
		System.out.println("*************");
		System.out.println(names[0]);
	}

	void displayNames(String[] names) {
		names[0] = "Kishan";

		for (String name : names) {
			System.out.println(name);
		}
	}

}
