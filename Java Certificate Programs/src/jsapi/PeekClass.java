package jsapi;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PeekClass {

	public static void main(String[] args) {

		Predicate<String> containO = new Predicate<>() {
			@Override
			public boolean test(String text) {
				return text.contains("o");
			}
		};

		Consumer<String> sayElement = element -> {
			System.out.println("One of the filtred elements is : " + element);
		};

		Stream.of("mother", "father", "sister", "brother").filter(containO).peek(sayElement)
				.forEach(System.out::println);

	}
}
