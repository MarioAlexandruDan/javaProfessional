package jc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class AtomicClass {

	public static void main(String[] args) {

		AtomicInteger atomicInteger = new AtomicInteger(10);
		int value = atomicInteger.get(); // Get the value 10
		atomicInteger.set(15); // Set the value 15

		int expectedValue = 15;
		int newValue = 20;
		// If the value of atomicInteger equals expectedValue, atomicInteger is set to
		// newValue
		atomicInteger.compareAndSet(expectedValue, newValue); // 20

		atomicInteger = new AtomicInteger(10); // 10
		value = atomicInteger.getAndAdd(10); // value contains 10 but atomicInteger contains 20
		value = atomicInteger.addAndGet(-10); // value and atomicInteger contain 10

		value = atomicInteger.getAndDecrement(); // value contains 10 but atomicInteger contains 9
		value = atomicInteger.decrementAndGet(); // value and atomicInteger contain 8

		value = atomicInteger.getAndIncrement(); // value contains 8 but atomicInteger contains 9
		value = atomicInteger.incrementAndGet(); // value and atomicInteger contain 10

		value = atomicInteger.updateAndGet(i -> i * 5); // value and atomicInteger contains 50
		value = atomicInteger.getAndUpdate(i -> i / 5); // value contains 50 but atomicInteger contains 10

		value = atomicInteger.accumulateAndGet(10, (a, b) -> a + b); // value and atomicInteger contains 20
		value = atomicInteger.getAndAccumulate(10, (a, b) -> a + b); // value contains 20 but atomicInteger contains 30

		LongAdder longAdder = new LongAdder();
		IntStream.range(0, 1000).forEach(i -> longAdder.add(1));
		System.out.println(longAdder); // 1000

		LongAccumulator longAccumulator = new LongAccumulator((a, b) -> a + b, 0L);
		IntStream.range(0, 100).forEach(i -> longAccumulator.accumulate(i));
		System.out.println(longAccumulator); // 4950
	}
}
