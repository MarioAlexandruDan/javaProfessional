package jc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String> {

	@Override
	public String call() {
		return "method 1";
	}
}

public class CallableClass {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		MyCallable c1 = new MyCallable();
		Future<String> future = executor.submit(c1);
		try {
			String result = future.get();
			System.out.println(result); // method 1
		} catch (ExecutionException | InterruptedException e) {

		}

		Callable<String> c2 = new Callable<>() {
			@Override
			public String call() {
				return "method 2";
			}
		};
		future = executor.submit(c2);
		try {
			String result = future.get();
			System.out.println(result); // method 2
		} catch (ExecutionException | InterruptedException e) {

		}

		Callable c3 = () -> "method 3";
		future = executor.submit(c3);
		try {
			String result = future.get();
			System.out.println(result); // method 3
		} catch (ExecutionException | InterruptedException e) {

		}

		executor.shutdown();

	}
}
