package Sec_17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing_files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("Easy Study");
		directory.mkdir();
		System.out.println("directory Created");
		File file = new File("D:\\Java\\Learn_Java\\test.txt");
//		try {
//			file.createNewFile();
//			System.out.println("File Created");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("error occured while creating a file");
//		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
			bw.write("Mitesh");
			bw.newLine();
			bw.write("Rahul");
			bw.newLine();
			bw.write("Prashant");
			bw.newLine();
			bw.write("Sehbas");
			bw.newLine();
			System.out.println("Writing on to the file completed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error occured while creating a file");
		}
	
	}

}
