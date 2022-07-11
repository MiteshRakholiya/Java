package sec_14;

import java.util.HashSet;
import java.util.Set;

public class sets {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Chaand");
		set.add("Chaand");
		set.add("Aafiya");
		set.add("Armaan");
		set.add("Mia");
		set.add("chaand");
		
		for(String name: set){
			System.out.println(name);
		}
		
        System.out.println(set.contains(1));
	}

}
