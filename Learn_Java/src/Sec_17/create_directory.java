package Sec_17;

import java.io.File;
import java.io.IOException;

public class create_directory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File directory = new File("Easy Study");
		directory.mkdir();
		System.out.println("directory Created");
		File file = new File("test.txt");
		file.createNewFile();
		System.out.println("File Created");
	}

}
