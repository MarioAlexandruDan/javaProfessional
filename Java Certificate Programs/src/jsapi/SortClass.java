package jsapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortClass {

	public static void main(String[] args) {
		Comparator<String> sortBySize = new Comparator<>() {
			@Override
			public int compare(String text1, String text2) {
				if (text1.length() > text2.length()) {
					return 1;
				} else if (text1.length() == text2.length()) {
					return 0;
				} else {
					return -1;
				}
			}
		};
		Comparator<String> sortByName = new Comparator<>() {
			@Override
			public int compare(String text1, String text2) {
				if (text1.compareToIgnoreCase(text2) > 0) {
					return 1;
				} else if (text1.compareToIgnoreCase(text2) == 0) {
					return 0;
				} else {
					return -1;
				}
			}
		};
		List<String> myList = Stream.of("mother", "father", "brother", "sis")
				.sorted(sortBySize.thenComparing(sortByName)).collect(Collectors.toList());

		myList.forEach(System.out::println); // sis father mother brother
	}
}
