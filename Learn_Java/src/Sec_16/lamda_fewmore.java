package Sec_16;

interface Lamda2{
	abstract public int demo2();
}
  
public class lamda_fewmore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamda2 lamda =()->{
			System.out.println("statment 1");
			return 10;
		};
		System.out.println(lamda.demo2());
}
}