package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Interface_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		new Interface_list().printList(countries);

		List<String> demo = new LinkedList<>();
		demo.add("One");
		demo.add("Two");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		new Interface_list().printList(demo);

	}

	void printList(List<String> list) {
		for (String element : list) {
			System.out.println("Element: " + element);
		}
		System.out.println("*****************************");
	}
}
