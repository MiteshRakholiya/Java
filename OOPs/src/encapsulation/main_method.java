package encapsulation;

import basics.Plane;

public class main_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane plane = new Plane(100, "Mitesh", "on");
//		plane.setName("Jet Airways");
//		System.out.println(plane.getName());
//		plane.setEngine("Own");
//		System.out.println(plane.getEngine());
//		plane.setSpeed(250);
//		System.out.println(plane.getSpeed());
		
//		plane.setName("Mitesh");
//		plane.setSpeed(10);
//		plane.setEngine("on");
		
		System.out.println(plane.run()); 
	}

}
