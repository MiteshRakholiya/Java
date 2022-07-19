package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> country = new LinkedList<>();
		country.add("India");
		country.add("Australia");
		country.add("USA");
		country.add("Canada");
		country.add("New Zelend");
		country.add("Bangladesh");
		country.add("Nepal");
		country.add("Bhutan");
		country.add("Bhutan");
		new List_interface().printList(country);
	
		 List<String> number = new ArrayList<>();
		 number.add("One");
		 number.add("Two");
		 number.add("Four");
		 number.add("Five");
		 number.add("Six");
		 new List_interface().printList(number);
	}
	
	

	void printList(List<String> list) {
		for (String element: list) {
			System.out.println("Element: "+element);
		}
		System.out.println("****************");
	}
}
