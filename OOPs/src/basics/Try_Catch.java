package basics;

public class Try_Catch {

//	public void case1(int x, int y) {
//		if (y != 0) {
//			System.out.println(x / y);
//		} else {
//			System.out.println("The value of y is 0");
//		}
//	}
//
//	public void case2(int x, int y) {
//		try {
//			System.out.println(x/y);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Inside exception block");
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Try_Catch tc = new Try_Catch();
//		tc.case2(10,0);
		
		int x=0;
		try {
			//System.out.println("The statment will get execute");
			System.out.println("We don't know, what will be the output "+x/0);
			//System.out.println("The statment will not get execute");
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic exception occured");
		} 
		catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Inside exception block");
		}
	}

}
