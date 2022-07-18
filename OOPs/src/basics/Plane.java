package basics;



public class Plane {
	private int speed;
	private String name;
	private String engine;	

//	private int speed = 100;
//	private String name = "Mitesh";
//	private String engine = "on";

	public Plane(){
		speed = 100;
		name = "Mitesh";
		engine = "on";
	}
	

	public Plane(int speed, String name, String engine) {
		this.speed = speed;
		this.name = name;
		this.engine = engine;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String run(){
		if(name.equals("Mitesh") && engine.equals("on") && speed >0	){
			return "running";
		}else
			return "not running";
	}

}
