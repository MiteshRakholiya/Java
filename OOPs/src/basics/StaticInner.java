package basics;

public class StaticInner {

	class Outer{
		
		public static class Inner{
			public static int x =5;
			 static void Innermethod() {
				System.out.println("Testing inner method");
			} 
		}
	}
}
