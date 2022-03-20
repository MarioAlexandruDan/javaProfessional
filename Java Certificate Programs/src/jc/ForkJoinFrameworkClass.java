package jc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

class Fibonacci extends RecursiveTask<Integer> {

	final int number;

	public Fibonacci(int number) {
		this.number = number;
	}

	@Override
	public Integer compute() {
		if (number <= 1) {
			return number;
		} else {
			Fibonacci f1 = new Fibonacci(number - 1);
			f1.fork();
			Fibonacci f2 = new Fibonacci(number - 2);
			f2.fork();
			return f1.join() + f2.join();
		}
	}
}

public class ForkJoinFrameworkClass {
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		Future<Integer> future = pool.submit(new Fibonacci(20)); // 6765
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		pool.shutdown();
	}
}
