package Sec_15;

public class volatile_keyword {
	public static int flag = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					if (flag == 0) {
						System.out.println("Running");
					} else {
						break;
					}
				}
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				volatile_keyword.flag = 1;
				System.out.println("Flag value updated");
			}
		}).start();
	}

}
