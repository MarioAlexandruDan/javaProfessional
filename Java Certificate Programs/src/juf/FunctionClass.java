package juf;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionClass {

	public static void main(String[] args) {

		Function<Integer, String> transformToString = new Function<>() {

			@Override
			public String apply(Integer number) {
				return "The number is : " + number;
			}
		};

		System.out.println(transformToString.apply(10)); // The number is : 10

		Function<Integer, Float> transformToFloat = (number) -> (float) number / 2;

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(transformToFloat).forEach(System.out::println);
		// 0.5 1.0 1.5 2.0 2.5 3.0 3.5 4.0 4.5 5.0
	}
}
