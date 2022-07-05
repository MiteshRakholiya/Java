package org.studyeasy;

public class Hello3 {

	public static void main(String[] args) {
		Car3 car = new Car3();
		car.setDoors("closed");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(10);
		System.out.println(car.run());

	}

}
