package Sec_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingfile_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("test.txt"));
			String line;
			while(sc.hasNext()) {
				line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error while reading file");
		}
	}

}
