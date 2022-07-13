package Sec_17;

import java.io.FileOutputStream;

public class write_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serialization bike = new serialization("bike", 2422);
		serialization car = new serialization("car",2803 );
	
		try(FileOutputStream fos = new FileOutputStream("Easy Study\\serialization.dat"));
	}

}
