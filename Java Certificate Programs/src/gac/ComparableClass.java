package gac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Shoe implements Comparable<Shoe> {

	private String name;
	private String color;
	private int price;

	public Shoe(String name, String color, int price) {

		this.name = name;
		this.color = color;
		this.price = price;
	}

	// getters and setters

	// decreasing sorting
	@Override
	public int compareTo(Shoe shoe2) {

		if (this.price > shoe2.price) {
			return -1;
		} else if (this.price < shoe2.price) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return name + " " + color + " " + price;
	}

}

public class ComparableClass {

	public static void main(String[] args) {

		List<Shoe> shoes = new ArrayList<>();

		shoes.add(new Shoe("Nike", "Blue", 500));
		shoes.add(new Shoe("Adidas", "Red", 300));
		shoes.add(new Shoe("Gucci", "Black", 1300));
		shoes.add(new Shoe("Vans", "Blue", 400));

		Collections.sort(shoes);

		shoes.forEach(System.out::println);

	}

}
