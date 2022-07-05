package generics;

import java.util.ArrayList;



public class started_with_generics2<T> extends GenericClass1<T> {
	public started_with_generics2(T variable) {
		super(variable);
		// TODO Auto-generated constructor stub
	}

	private static GenericClass1<Integer> test;

	public static void main(String[] args) {

		// System.out.println(new GenericClass<String>("Some text"));
		// System.out.println(new GenericClass<Double>(2.0));
		// System.out.println(new GenericClass<Character>('#'));

		ArrayList<GenericClass1> list = new ArrayList<>();
		list.add(new GenericClass1<Integer>(1));
		list.add(new GenericClass1<Integer>(2));
		list.add(new GenericClass1<String>("String"));
		list.add(new GenericClass1<Integer>(4));
		list.add(new GenericClass1<Integer>(5));
		list.add(new GenericClass1<Integer>(6));

		for (GenericClass1 i : list) {

		}
	}
}
