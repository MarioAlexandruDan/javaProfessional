package jc;

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("method 1");
	}
}

public class RunnableClass {

	public static void main(String[] args) {

		MyThread m1 = new MyThread();
		Thread t1 = new Thread(m1);
		t1.start(); // method 1

		Runnable secondThread = new Runnable() {
			@Override
			public void run() {
				System.out.println("method 2");
			}
		};
		Thread t2 = new Thread(secondThread);
		t2.start(); // method 2

		Runnable thirdThread = () -> System.out.println("method 3");
		Thread t3 = new Thread(thirdThread);
		t3.start(); // method 3
	}
}
