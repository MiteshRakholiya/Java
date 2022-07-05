package Autoboxind_and_Unboxing;

import java.util.ArrayList;

class intWrapper {
	public int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
}

public class test {

	public static void main(String[] args) {
//	ArrayList<Integer> StudentNumbers = new ArrayList<>();
//	StudentNUmbers.add(25); // Autoboxing
//	System.out.println(StudentNumbers.get(0));

//		ArrayList<intWrapper> studentNumbers = new ArrayList<>();
//		studentNumbers.add(new intWrapper(12)); //boxing
//		System.out.println(studentNumbers.get(0).getIntValue());  // unboxing 

		ArrayList<Double> demoList = new ArrayList<>();
		// demoList.add(25.5);
		// demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.0)); // This is done while autoboxing
		// System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); // This is done while unboxing

	}
}
