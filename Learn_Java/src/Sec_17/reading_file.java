package Sec_17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class reading_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("D:\\Java\\Learn_Java");
		directory.mkdir();
		File file = new File("D:\\Java\\Learn_Java\\test.txt");
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
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error occured while creating a file");
		}
	try {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\Learn_Java\\test.txt"));
		boolean line;
		System.out.println("--------------------");
		try {
			while(line = br.readLine() != null) {
				System.out.println(line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
