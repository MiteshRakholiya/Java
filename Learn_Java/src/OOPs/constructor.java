package OOPs;

public class constructor {
	
	String emp_name;
	int emp_id;
	
	constructor(String emp_name, int emp_id ){
		this.emp_name=emp_name;
		this.emp_id=emp_id;
	}
	
	public static void main(String[] args) {
		constructor c1 = new constructor("Mitesh",100);
		constructor c2 = new constructor("Mahesh",101 );
		System.out.println("constructor 1 : "+c1.emp_name+" "+c1.emp_id);
		System.out.println("constructor 2 : "+c2.emp_name+" "+c2.emp_id);
	}
}
