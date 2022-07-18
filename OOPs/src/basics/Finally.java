package basics;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		try {
			// System.out.println("The statment will get execute");
			System.out.println("We don't know, what will be the output: " + x / 0);
			// System.out.println("The statment will not get execute");
		}catch (RuntimeException e) {
			System.out.println("Runtime exception");
		} catch (Exception e) {
			System.out.println("Exception ||");
		}
		finally {
			System.out.println("This will be get printed");
		}
	}
}
