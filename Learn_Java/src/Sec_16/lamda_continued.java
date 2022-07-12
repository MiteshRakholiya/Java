package Sec_16;

public class lamda_continued {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(() ->{
			System.out.println("I am inside this thread 1");
			System.out.println("This is another line");
		}).start();	
		
	}
}
