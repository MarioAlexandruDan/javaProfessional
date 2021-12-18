package juf;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class BinaryOperatorClass {

	public static void main(String[] args) {

		BinaryOperator<Integer> addNumbers = new BinaryOperator<>() {
			@Override
			public Integer apply(Integer number1, Integer number2) {
				return number1 + number2;
			}
		};

		System.out.println(addNumbers.apply(30, 70)); // 100

		BinaryOperator<String> addTexts = (text1, text2) -> text1 + "*" + text2;

		Optional<String> family = Stream.of("mother", "father", "sister", "brother").reduce(addTexts);

		System.out.println(family.get()); // mother*father*sister*brother
	}
}
