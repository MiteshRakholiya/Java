package sec_14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_types {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		Set<String> set1 = new TreeSet<>();
//		Set<String> set2 = new LinkedHashSet<>();
		for(int i = 30; i>0; i--){
			set.add("A"+i);
		}
		for(String i: set){
			System.out.println(i);
		}

	}


}
