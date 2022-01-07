package jc;

public class RaceConditionsClass {

	int counter = 0;

	public void incrementCounter() {
		try {
			Thread.sleep(13);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {

		RaceConditionsClass object = new RaceConditionsClass();

		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					object.incrementCounter();
					System.out.println("value for " + Thread.currentThread().getName() + " is " + object.getCounter());
				}
			}).start();
		}
	}
}
