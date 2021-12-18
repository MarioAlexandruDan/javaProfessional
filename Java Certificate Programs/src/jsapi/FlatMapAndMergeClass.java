package jsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapAndMergeClass {

	public static void main(String[] args) {

		List<String> names1 = Arrays.asList("Mario", "Andrei");
		List<String> names2 = Arrays.asList("Ion", "Laura");

		Stream.of(names1, names2).flatMap(names -> names.stream()).forEach(System.out::println);
		// Mario Andrei Ion Laura

	}
}
