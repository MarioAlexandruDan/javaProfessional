package jc;

public class StarvationClass {

	static class StarvationThread {

		public synchronized void saySomething() {
			while (true) {
				System.out.println("The thread " + Thread.currentThread().getName() + " is executing");
			}
		}
	}

	public static void main(String[] args) {

		StarvationThread object = new StarvationThread();

		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					object.saySomething();
				}
			}).start();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// making sure the program closes so you don't forget it running forever
		System.exit(0);
	}
}
