package juf;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerClass {

	public static void main(String[] args) {

		Consumer<String> evaluateString = new Consumer<>() {
			@Override
			public void accept(String text) {
				System.out.println(text);
			}
		};

		evaluateString.accept("Mario"); // Mario

		Consumer<String> evaluateStringLambda = text -> System.out.println(text);

		Stream.of("mother", "father", "sister", "brother").forEach(evaluateStringLambda);
		// mother father sister brother

	}

}
