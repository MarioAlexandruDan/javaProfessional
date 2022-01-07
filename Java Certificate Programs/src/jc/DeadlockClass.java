package jc;

public class DeadlockClass {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {

		Thread t1 = new Thread(new LockThread1());
		Thread t2 = new Thread(new LockThread2());

		t1.start();
		t2.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// making sure the program closes so you don't forget it running forever
		System.exit(0);
	}

	private static class LockThread1 implements Runnable {

		@Override
		public void run() {

			synchronized (lock1) {
				System.out.println("Lock1 " + Thread.currentThread().getName());
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("Lock2 " + Thread.currentThread().getName());
				}
			}

		}
	}

	private static class LockThread2 implements Runnable {

		@Override
		public void run() {

			synchronized (lock2) {
				System.out.println("Lock2 " + Thread.currentThread().getName());
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("Lock1 " + Thread.currentThread().getName());
				}
			}

		}
	}
}
