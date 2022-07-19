package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> number = new ArrayList<>();
		number.add("One");
		number.add("Two");
		number.add("Four");
		number.add("Five");
		number.add("Six");
		
		
		Iterators IT = new Iterators();
		new Iterators().printList(number);
		System.out.println("*************");
		number.sort(null);
		IT.printList(number);
		System.out.println("*************");
		Collections.reverse(number);
		IT.printList(number);
		// System.out.println(number);
	}

	void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());

		}
	}

}
