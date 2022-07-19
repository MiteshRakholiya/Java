package collection;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	
	static ArrayList<String> names = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		names.add("Mitesh");
		names.add("Rahul");
		names.add("Jhon");
		names.add("Sandip");
		names.add("Akshit");
		names.add("Dharmik");
		names.add("Jayesh");
		names.add("Vishal");
		names.add("Nitin");
		
		Array_List al = new Array_List();
			
		al.removeNamebyPosition(0);
		System.out.println("****************");
		al.displayList(names);
		System.out.println("****************");
		al.removeNamebyString("Sandip");
		al.displayList(names);	
		System.out.println("****************");
		al.modifyName(2,"Jaydeep");
		al.displayList(names);
		System.out.println("****************");
		
		int position = al.search("Jayesh");
		if(position !=1) {
			al.modifyName(position, "Sagar");
			al.displayList(names);
		}else {
			System.out.println("Invalid Entry");
		}
		System.out.println(position);
//		System.out.println(names.get(0));
//		System.out.println(names.get(5));
	}
	
	void displayList(ArrayList<String> names) {
		for(String name:names)
			System.out.println(name);
	}
	
	void removeNamebyPosition(int position) {
		names.remove(position);
	}

	void removeNamebyString(String name) {
		names.remove(name);
	}
	
	void modifyName(int position, String newName) {
		names.set(position, newName);
	}
	
	int search(String name) {
		return names.indexOf(name);
	}
}
