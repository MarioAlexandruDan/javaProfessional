package gac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ShoeV2 {

	private String name;
	private String color;
	private int price;

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public ShoeV2(String name, String color, int price) {

		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + color + " " + price;
	}

}

public class ComparatorClass {

	public static void main(String[] args) {

		List<ShoeV2> shoev2 = new ArrayList<>();

		shoev2.add(new ShoeV2("Nike", "Blue", 500));
		shoev2.add(new ShoeV2("Adidas", "Red", 300));
		shoev2.add(new ShoeV2("Gucci", "Black", 1300));
		shoev2.add(new ShoeV2("Vans", "Blue", 400));

		Comparator<ShoeV2> logic = new Comparator<>() {

			@Override
			public int compare(ShoeV2 shoe1, ShoeV2 shoe2) {
				if (shoe1.getPrice() > shoe2.getPrice()) {
					return -1;
				} else if (shoe1.getPrice() < shoe2.getPrice()) {
					return 1;
				} else {
					return 0;
				}
			}

		};

		Collections.sort(shoev2, logic);

		shoev2.forEach(System.out::println);

	}
}
