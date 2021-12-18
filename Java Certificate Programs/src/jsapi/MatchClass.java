package jsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatchClass {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.addAll(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toList()));

		boolean rezult = listOfIntegers.stream().anyMatch(i -> i % 2 == 0);
		System.out.println(rezult); // true

		rezult = listOfIntegers.stream().allMatch(i -> i % 2 == 0);
		System.out.println(rezult); // false

		rezult = listOfIntegers.stream().noneMatch(i -> i.getClass().equals("".getClass()));
		System.out.println(rezult); // true

		Stream<Integer> integerSteam = Stream.empty();
		rezult = integerSteam.anyMatch(i -> i == 10000);
		System.out.println(rezult); // false

		Stream<Integer> integerSteam2 = Stream.empty();
		rezult = integerSteam2.allMatch(i -> i == 10000);
		System.out.println(rezult); // true

		Stream<Integer> integerSteam3 = Stream.empty();
		rezult = integerSteam3.noneMatch(i -> i == 10000);
		System.out.println(rezult); // true
	}
}
