package Sec_17;

import java.io.File;
import java.io.IOException;

public class file_on_disk {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		{
			File file = new File("src/easy.txt");
			file.createNewFile();
			System.out.println("File Created");
		}
	}

}
