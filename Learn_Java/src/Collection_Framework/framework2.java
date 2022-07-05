package Collection_Framework;

import java.util.ArrayList;

public class framework2 {


		static ArrayList<String> listNames = new ArrayList<>();
		
		public static void main(String[] args) {
			listNames.add("Mitesh");
			listNames.add("Prashant");
			listNames.add("Mehul");
			listNames.add("Meraj");
			listNames.add("Rahul");
			listNames.add("Nirav");
			listNames.add("Darshan");
			listNames.add("Mihir");
			framework2 app = new framework2();
			app.displayList(listNames);	
			System.out.println("************");
	        int position = app.search("Meraj");
	        if(position != -1){
	        	app.modifyName(position, "Sehbas");
	        	app.displayList(listNames);	
	        }else{
	        	System.out.println("Invalid entry");
	        }
			
		}
		void displayList(ArrayList<String> names){
			for(String name: names){
				System.out.println(name);
			}	
		}
		void modifyName(int position, String newName){
			listNames.set(position, newName);
		}
		
		int search(String name){
			return listNames.indexOf(name);
		}


	}


