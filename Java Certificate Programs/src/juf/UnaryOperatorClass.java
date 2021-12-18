package juf;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnaryOperatorClass {

	public static void main(String[] args) {

		UnaryOperator<Integer> addZero = new UnaryOperator<>() {
			@Override
			public Integer apply(Integer number) {
				return number * 10;
			}
		};

		System.out.println(addZero.apply(70)); // 700

		UnaryOperator<String> addStar = text -> "*" + text + "*";

		List<String> family = Stream.of("mother", "father", "sister", "brother").map(addStar)
				.collect(Collectors.toList());

		family.forEach(System.out::println); // *mother* *father* *sister* *brother*
	}
}
