package iterators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		new iterators().printList(countries);
	}

	void printList(List<String> list) {

		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
