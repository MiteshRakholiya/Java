package Collection_Framework;

import java.util.ArrayList;

public class framework {

	static ArrayList<String> listnames = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listnames.add("Mitesh");
		listnames.add("Prashant");
		listnames.add("Mehul");
		listnames.add("Meraj");
		listnames.add("Rahul");
		listnames.add("Nirav");
		listnames.add("Darshan");
		listnames.add("Mihir");

		framework app = new framework();
		app.displayList(listnames);
		
//		app.removeNameByPosition(0);
//		System.out.println("----------------------");
//		app.displayList(listnames);
//		System.out.println("----------------------");
//		System.out.println(listnames.get(0));
//		System.out.println(listnames.get(1));

		
		System.out.println("----------------------");
		app.removeNameByString("Nirav");
		app.displayList(listnames);
		System.out.println("************");
		System.out.println(listnames.get(3));
	}

	void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

	void removeNameByPosition(int position) {
		listnames.remove(position);
	}

	void removeNameByString(String name) {
		listnames.remove(name);
	}
}
