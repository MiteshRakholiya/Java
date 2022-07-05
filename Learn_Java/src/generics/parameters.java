package generics;
/*
 * 
The naming conventions are as follows:
T - Type
E - Element
K - Key
N - Number
V - Value
 * 
 */



public class parameters {
	public static void main(String[] args) {
		Data<Integer, String> data = new Data<Integer, String>(1, "Chaand");

		System.out.println("Key: " + data.getKey() + " value: " + data.getValue());
		data.display("2.0", 25);
	}
}
