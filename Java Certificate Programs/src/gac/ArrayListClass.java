package gac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(19);
		numbers.add(19);
		numbers.add(20);
		numbers.add(67);
		numbers.add(89);
		numbers.add(9);
		numbers.add(1);
		numbers.add(23);

		numbers.remove(1);

		numbers.set(numbers.size() - 1, 100);

		Collections.sort(numbers);

		for (Integer i : numbers) {
			System.out.println(i);
		} // 1 9 19 20 67 89 100

		numbers.clear();

		System.out.println(numbers.contains(2)); // false

		numbers.forEach(System.out::println); //

	}
}
