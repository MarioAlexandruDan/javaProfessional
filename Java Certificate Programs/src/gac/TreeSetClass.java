package gac;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {

		Set<String> texts = new TreeSet<>();

		texts.add("Mario");
		texts.add("Mario");
		texts.add("Maria");
		texts.add("Minion");
		texts.add("George");
		texts.add("Ivan");
		texts.add("Alin");

		texts.remove("Maria");

		System.out.println(texts.size()); // 5

		for (String i : texts) {
			System.out.println(i);
		} // Alin George Ivan Mario Minion

		texts.clear();

		texts.forEach(System.out::println); //

	}
}
