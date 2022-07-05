package Constructor;

public class Car3 {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car3(){
		doors = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}
		
	public Car3(String doors, String engine, String driver, int speed) {
		
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	
	public int getSpeed(){
		return speed;
	}
	public String getDoors() {
		return doors;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public String run(){
		if(doors.equals("closed") && engine.equals("on")
				&& driver.equals("seated") && speed >0	){
			return "running";
		}else
			return "not running";
	}
	

}
