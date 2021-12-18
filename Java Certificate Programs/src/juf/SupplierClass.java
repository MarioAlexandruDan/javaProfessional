package juf;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierClass {

	public static void main(String[] args) {

		int number = 1;

		Supplier<Integer> addTen = new Supplier<>() {
			@Override
			public Integer get() {
				return 10;
			}
		};

		number += addTen.get();

		System.out.println(number); // 11

		Supplier<String> addText = () -> "Some random text";

		Stream.generate(addText).limit(5).forEach(System.out::println);
		// Some random text Some random text Some random text Some random text Some
		// random text

	}
}
