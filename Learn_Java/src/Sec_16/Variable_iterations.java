package Sec_16;

import java.util.ArrayList;
import java.util.List;

import Sec_15.interrupt;


class Test{
	private String name;

	public Test(String name) {
		this.name = name;
	}

	
	
	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "Data3 [name=" + name + "]";
	}




}

public class Variable_iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x =10;
//		new Thread(()->System.out.println("The value of x is "+x)).start();

	List<Test> list = new ArrayList<>();
	list.add(new Test("Chaand"));
	list.add(new Test("John"));
	list.add(new Test("Mia"));
	list.add(new Test("Angelica"));
	list.add(new Test("Roy"));

    list.forEach(temp->{
    	
    	System.out.println(temp.getName());
    });
	
//	for(Integer i:list) {
//		if(i>=10) {
//			System.out.println(i);
//		}
//	}

//	list.forEach(i -> {
//		if (i >= 10) {
//			System.out.println(i);
//		}
//	});

}

}
