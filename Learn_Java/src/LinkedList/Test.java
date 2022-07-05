package LinkedList;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		new Test().printList(countries);
		countries.add(1, "Canada");
		countries.add("Bragil");
		new Test().printList(countries);
	    countries.set(7, "Brazil");
	    new Test().printList(countries);
	    countries.remove(4);
	    new Test().printList(countries);
		
	}
	void printList(LinkedList<String> list){
		for(String element: list){
			System.out.println("Element: "+element);
		}
		System.out.println("*****************************");
	}
	}


