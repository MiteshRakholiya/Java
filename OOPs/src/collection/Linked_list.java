package collection;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> country = new LinkedList<>();
		country.add("India");
		country.add("Australia");
		country.add("USA");
		country.add("Canada");
		country.add("New Zelend");
		country.add("Bangladesh");
		country.add("Nepal");
		country.add("Bhutan");
		country.add("Bhutan");
		
	//	System.out.println(country);
		
		//country.removeAll(country);
		//country.remove("USA");
		//country.add("Africa");
		//country.add(3, "Belgium");
		//country.removeFirst();
		//country.removeLast();
		//country.removeFirstOccurrence("India");
//		country.removeLastOccurrence("Nepal");
//		System.out.println(country);
		
		new Linked_list().printList(country);
		country.add(3, "Belgium");
		new Linked_list().printList(country);
		country.set(9, "Bhutann");
		new Linked_list().printList(country);
	}
	
	void printList(LinkedList<String> list) {
		for(String element: list) {
			System.out.println("Element: "+element);
		}
		System.out.println("*******************");
	}
}
