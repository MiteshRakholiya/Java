package basics;

//class Outer{
//	int a;
//	void show() {
//		
//	}
//	
//	static class inner{
//		public void display() {
//			System.out.println("Display method");
//		}
//	}
//}

class Door{
	public boolean isLocked(String key) {
		class Lock{
			public boolean isLocked(String key) {
				if(key.equals("qwerty")) {
					return false;
				}else {
					return true;
				}		
			}
		}
		return new Lock().isLocked(key);
		
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Outer ob = new Outer();
//		ob.show();
		
//		Outer.inner in = new Outer.inner();
//		in.display();
		
//		 Door d = new Door();
//		 System.out.println(d.isLocked("qwerty"));
		 
		 if(new Door().isLocked(args[0])) {
			 System.out.println("Shop has closed, Visit later");
		 }else {
			 System.out.println("Welcome, we are open ");
		 }
		 System.out.println(args[1]);
		 System.out.println(args[2]);
	}

}
