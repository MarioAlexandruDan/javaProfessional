package jc;

class ObjectClass {
	public static void makeThreadWait() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {

		}
	}

	public static void makeMainWait() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {

		}
	}
	// added this 2 methods so you can see better in console

	private int number = 0;
	private int syncNumber = 0;

	public void incrementNumber() {
		makeThreadWait();
		number++;
	}

	public int getNumber() {
		return number;
	}

	public synchronized void incrementSyncNumber() {
		makeThreadWait();
		syncNumber++;
	}

	public int getSyncNumber() {
		return syncNumber;
	}
}

public class SynchronizedClass {

	public static void main(String[] args) {

		ObjectClass o1 = new ObjectClass();
		ObjectClass o2 = new ObjectClass();

		for (int i = 0; i < 4; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					synchronized (o1) {
						o1.incrementNumber();
						System.out.println(Thread.currentThread().getName() + " has " + o1.getNumber());
					}
				}
			}).start();
		}

		ObjectClass.makeMainWait();

		for (int i = 0; i < 4; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					o2.incrementNumber();
					System.out.println("Type 2 " + Thread.currentThread().getName() + " has " + o2.getNumber());
				}
			}).start();
		}

		ObjectClass.makeMainWait();

		for (int i = 0; i < 4; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					o1.incrementSyncNumber();
					System.out.println("Type 3 " + Thread.currentThread().getName() + " has " + o1.getSyncNumber());
				}
			}).start();
		}

	}
}
