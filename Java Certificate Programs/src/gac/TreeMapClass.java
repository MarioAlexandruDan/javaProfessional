package gac;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {

		Map<Integer, String> apartments = new TreeMap<>();

		apartments.put(1, "Mario");
		apartments.put(6, "Mario");
		apartments.put(5, "Hamsie");
		apartments.put(3, "Ion");
		apartments.put(7, "Mihai");
		apartments.put(4, "George");
		apartments.put(2, "Marian");

		System.out.println(apartments.get(6)); // Mario

		apartments.remove(6);

		System.out.println(apartments.get(6)); // null

		apartments.put(6, "Mario");

		System.out.println(apartments.size()); // 7

		for (String value : apartments.values()) {
			System.out.println(value);
		} // Mario Marian Ion George Hamsie Mario Mihai

		for (Integer key : apartments.keySet()) {
			System.out.println(key + " " + apartments.get(key));
		} // 1 Mario 2 Marian 3 Ion 4 George 5 Hamsie 6 Mario 7 Mihai

		apartments.clear();

	}
}
