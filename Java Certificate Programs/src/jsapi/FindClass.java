package jsapi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindClass {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.addAll(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toList()));

		Optional<Integer> rezult = listOfIntegers.stream().findAny();

		if (rezult.isPresent()) {
			System.out.println(rezult); // 1
		}

		rezult = listOfIntegers.stream().findFirst();

		if (rezult.isPresent()) {
			System.out.println(rezult.get()); // 1
		}
		System.out.println();

		List<Integer> listOfOtherIntegers = new LinkedList<>();
		listOfOtherIntegers.addAll(Stream.of(5, 2, 3, 1, 7, 8, 4, 9, 6, 10).collect(Collectors.toList()));

		rezult = listOfOtherIntegers.stream().findFirst();

		if (rezult.isPresent()) {
			System.out.println(rezult.get()); // 5
		}

	}
}
