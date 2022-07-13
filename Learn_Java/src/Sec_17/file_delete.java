package Sec_17;

import java.io.File;

public class file_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Java\\Learn_Java\\test.txt");
		if(file.delete()) {
			System.out.println("Deletion is successful");
		}
		else {
			System.out.println("Error while deleting");
		}
	}

}
