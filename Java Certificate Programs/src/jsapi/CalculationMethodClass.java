package jsapi;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CalculationMethodClass {

	public static void main(String[] args) {

		OptionalInt optInt = IntStream.range(1, 10).min();

		optInt.ifPresent(System.out::println); // 1

		optInt = IntStream.range(1, 10).max();

		optInt.ifPresent(System.out::println); // 9

		OptionalDouble optDouble = IntStream.range(1, 10).average();

		optDouble.ifPresent(System.out::println); // 5.0

		int sum = IntStream.range(1, 10).sum();
		long count = IntStream.range(1, 10).count();

		System.out.println(sum + " " + count); // 45 9

	}
}
