package Sec_15;

class Brackets_method {
	private Object lock = "lock";
	public void generate() {
		synchronized (lock) {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
		for(int j=0; j<=10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class synchronized_block {
	public static void main(String[] args) {
		Brackets_method bracket = new Brackets_method();
//		Brackets_method bracket1 = new Brackets_method();
		// bracket.generate();
		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				// TODO Auto-ge nerated method stub
				for (int i = 1; i <= 5; i++) {
					bracket.generate();
				} 
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 1 was: " +(endTime-startTime));
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				// TODO Auto-generated method stub
				for (int i = 1; i <= 5; i++) {
					bracket.generate();
				}
				long endTime = System.currentTimeMillis();
		 		System.out.println("Time required for thread 2 was: "  +(endTime-startTime));
			}
		}).start();

	}

}
