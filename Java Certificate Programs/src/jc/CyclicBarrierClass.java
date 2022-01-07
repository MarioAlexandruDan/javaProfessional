package jc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Passenger extends Thread {

	private int waitTime;
	private CyclicBarrier cyclicBarrier;

	public Passenger(int waitTime, CyclicBarrier cyclicBarrier, String name) {
		super(name);
		this.waitTime = waitTime;
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " has arrived at his destination!");
		try {
			if (cyclicBarrier.await() == 0) {
				System.out.println(" All 4 passengers arrived! The next will be arriving soon.");
			}
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

	}
}

public class CyclicBarrierClass {

	public static void main(String[] args) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(4);

		new Passenger(1000, cyclicBarrier, "Mario").start();
		new Passenger(2000, cyclicBarrier, "Mihai").start();
		new Passenger(3000, cyclicBarrier, "Silviu").start();
		new Passenger(4000, cyclicBarrier, "George").start();
		new Passenger(1500, cyclicBarrier, "Adrian").start();
		new Passenger(2500, cyclicBarrier, "Ana").start();
		new Passenger(3500, cyclicBarrier, "Monica").start();
		new Passenger(4500, cyclicBarrier, "Florin").start();

	}
}
