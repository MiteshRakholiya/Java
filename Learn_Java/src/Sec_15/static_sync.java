package Sec_15;

public class static_sync {
	synchronized static public void generate(String threadCode) {
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println("Generated by thread: " + threadCode);
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		static_sync bracket = new static_sync();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					static_sync.generate("Thread 1");
				}

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					static_sync.generate("Thread 2");
				}

			}
		}).start();

	}
}
