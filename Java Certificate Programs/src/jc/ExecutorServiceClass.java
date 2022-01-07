package jc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceClass {
	public static void main(String[] args) {

		// Creates an Executor that uses a single worker thread operating off an
		// unbounded queue.
		ExecutorService es1 = Executors.newSingleThreadExecutor();
		// Creates a thread pool that reuses a fixed number of threads operating off a
		// shared unbounded queue.
		ExecutorService es2 = Executors.newFixedThreadPool(10);
		// Creates a thread pool that can schedule commands to run after a given delay,
		// or to execute periodically.
		ExecutorService es3 = Executors.newScheduledThreadPool(10);

		Runnable r1 = () -> System.out.println("runnable");
		Callable c1 = () -> "callable1";
		Callable c2 = () -> "callable2";
		Callable c3 = () -> "callable3";

		List<Callable<String>> callables = new ArrayList<>();
		callables.add(c1);
		callables.add(c2);
		callables.add(c3);

		es1.execute(r1); // runnable
		Future future = es1.submit(r1); // runnable
		try {
			System.out.println(future.get()); // null
		} catch (ExecutionException | InterruptedException e) {

		}

		Future<String> future2 = es2.submit(c1);
		try {
			System.out.println(future2.get()); // callable1
		} catch (ExecutionException | InterruptedException e) {

		}

		try {
			String result = es3.invokeAny(callables);
			System.out.println(result); // callable1
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Future<String>> list = new ArrayList<>();
		try {
			list = es2.invokeAll(callables);
		} catch (InterruptedException e) {

		}

		list.forEach(fut -> {
			try {
				System.out.println(fut.get());
			} catch (InterruptedException | ExecutionException e) {
			}
		});
//		callable1 callable2 callable3

		es1.shutdown();
		es2.shutdown();
		es3.shutdown();
	}
}
