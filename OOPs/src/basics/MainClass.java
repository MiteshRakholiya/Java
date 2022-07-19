package basics;

import basics.StaticInner.Outer;
import encapsulation.EncapsulationsIntro;

class Person{
	String name;
	int age;
	static int count;
	
	public Person() {  // default constructor	
		count++;
		//System.out.println("Creating an object");
	}
	
//	public Person(int newAge, String newName) {   // Parameterized constructor
//		this(); 
//		name = newName;
//		age = newAge;
//				
//	}
	
	public Person(int age, String name) {   
		
		this.name = name;
		this.age = age;
				
	}
	
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name +" is eating");
	}
	
	void walk(int steps) {
		System.out.println(name + " walked " +steps + " steps ");
	}
	
	void dowork() {
		System.out.println("person is working");
		
		
	}
}



class Tester extends Person {
	public Tester(int age, String name) {
		super(age,name);
	}
	
	void walk() {
		System.out.println("Tester " + name + " is walking");
	}
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1 = new Person();
//		p1.age =24;
//		p1.name = "Mitesh";
		//System.out.println(p1.age+" "+p1.name);

//		Person p2 = new Person();
//		p2.age = 30;
//		p2.name = "Renish";
		//System.out.println(p2.age+" "+p2.name);
		
//		Person p3 = new Person(31, "ashish");
//		System.out.println("");
		
		//p1.eat();
//		p3.walk();
//		p3.walk(2);
//		System.out.println(Person.count);
		
//		Tester t1 = new Tester(31, "Sanjay");
//		t1.walk();

//		EncapsulationsIntro obj = new EncapsulationsIntro()
//		obj.doWork();
		
//		Plane plane = new Plane();
//		plane.setName("Jet Airways");
//		System.out.println(plane.getName());
		
//		Cycle c = new Hero();
//		System.out.println(c.chain());
//		System.out.println(c.handle());
//		System.out.println(c.pendal());
//		System.out.println(c.wheel());
//		
//		Cycle c1 = new Avon();
//		System.out.println(c.chain());
//		System.out.println(c.handle());
//		System.out.println(c.pendal());
//		System.out.println(c.wheel());
		
//		Outer.Inner.Innermethod();
//		System.out.println(Outer.Inner.x);
		
//		B obj = new B();
//		obj.India();
//		obj.Canada();
		
//		int[] intArray = {1,2,3,4,5,6,7,8,9};
//		System.out.println(intArray[3]);
//		
//		float[] floatArray = {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f,8.0f,9.0f};
//		System.out.println(floatArray[10]);
		
		String[] stringArray = {"Mitesh","Rahul","Jayesh","Sameer","Prashant"};
//		for(int i=0;i<stringArray.length;i++) {
//			System.out.println(stringArray[i]);	
//		}
		for (String name: stringArray) {
			System.out.println(name);
		}
		
	}

}

