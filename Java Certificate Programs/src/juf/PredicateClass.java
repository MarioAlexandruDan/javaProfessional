package juf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateClass {

	public static void main(String[] args) {

		Predicate<Integer> evaluateInteger = number -> number > 5;

		List<Integer> integerList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(evaluateInteger)
				.collect(Collectors.toList());

		integerList.forEach(System.out::print); // 678910
		System.out.println();

		Predicate<String> evaluateString = new Predicate<>() {
			@Override
			public boolean test(String t) {
				return t.length() > 5;
			}
		};

		List<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");

		for (String color : colors) {
			if (evaluateString.test(color)) {
				System.out.println(color);
			}
		} // Yellow
	}
}
