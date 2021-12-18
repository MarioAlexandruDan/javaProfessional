package jsapi;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalClass {

	public static void main(String[] args) {

		OptionalInt intOptional = IntStream.range(1, 5).filter(number -> number % 2 == 0).findAny();

		intOptional.ifPresent(rezult -> System.out.println("One of the numbers is : " + rezult));
		// One of the numbers is : 2

		intOptional = OptionalInt.empty();

		if (intOptional.isPresent()) {
			System.out.println("it's prezent"); // not printed
		} else {
			intOptional = OptionalInt.of(10);
			System.out.println(intOptional.getAsInt()); // 10
			intOptional = OptionalInt.empty();
		}

		try {
			intOptional.orElseThrow(Exception::new);
		} catch (Exception e) {
			System.out.println("Catched the exception!"); // Catched the exception!s
		}
	}
}
