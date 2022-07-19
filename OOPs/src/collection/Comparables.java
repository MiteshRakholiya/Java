package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {

	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return 1;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return name;
	}
}

public class Comparables {
	public static void main(String[] args) {

		List<Object> element = new LinkedList<>();
		element.add(new Names("mitesh"));
		element.add(new Names("Rahul"));
		element.add(new Names("Prashant"));
		element.add("Some String");
		element.add(1);
		element.add(2.0);
		element.add("#@#");
		

		Comparables cp = new Comparables();
		cp.printList(element);
		System.out.println("*****************");
		
//		Collections.sort(element);
//		cp.printList(element);
	}

	void printList(List<Object> list) {
		ListIterator<Object> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());

		}
	}
}
