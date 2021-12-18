package jsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SaveCollectionClass {

	public static void main(String[] args) {

		List<String> letters = new ArrayList<>();

		letters.add("H");
		letters.add("e");
		letters.add("l");
		letters.add("l");
		letters.add("o");

		List<String> word1 = letters.stream().collect(() -> new ArrayList<>(), (c, s) -> c.add(s.toUpperCase()),
				(c1, c2) -> c1.addAll(c2));

		word1.forEach(System.out::println); // H E L L O

		List<String> word2 = letters.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

		word2.forEach(System.out::println); // H E L L O

	}
}
