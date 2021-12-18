package gac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {

		Optional<Integer> rez = Stream.of(2, 4, 6, 8, 10, 12, 14).max(Comparator.comparing(i -> i));

		System.out.println(rez.get()); // 14

		IntStream odd = IntStream.range(1, 10).filter(i -> i % 2 == 1);

		odd.forEach(System.out::print); // 13579
		System.out.println();

		List<String> rainbow = new ArrayList<>();

		rainbow.add("Red");
		rainbow.add("Orange");
		rainbow.add("Yellow");
		rainbow.add("Green");
		rainbow.add("Blue");
		rainbow.add("Indigo");
		rainbow.add("Violet");

		long colors = rainbow.stream().count();

		System.out.println(colors); // 7

		List<String> rgb = rainbow.stream()
				.filter(color -> color.equals("Red") || color.equals("Green") || color.equals("Blue"))
				.collect(Collectors.toList());

		rgb.forEach(System.out::print); // RedGreenBlue
		System.out.println();

		long ls = LongStream.range(1, 10).map(number -> number * 10).reduce(100, (sum, number) -> sum += number); // 100
																													// +
																													// 10
																													// +
																													// 20
																													// +
																													// 30
																													// +
																													// 40
																													// +
																													// 50
																													// +
																													// 60
																													// +
																													// 70
																													// +
																													// 80
																													// +
																													// 90

		System.out.println(ls); // 550

		Predicate<Integer> firstRule = i -> i > 5;
		Predicate<Integer> secondRule = i -> i < 10;

		Predicate<Integer> bothRules = firstRule.and(secondRule);

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(bothRules).forEach(System.out::print); // 6789
	}

}
