package gac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class GenericType<T> {

	T input;

	public GenericType(T input) {

		this.input = input;
	}

	@Override
	public String toString() {
		return input.toString();
	}

}

public class GenericClass {

	public static void main(String[] args) {

		GenericType<String> example1 = new GenericType<>("Mario");
		GenericType<Integer> example2 = new GenericType<>(24);
		GenericType<Long> example3 = new GenericType<>(2424l);

		Object example4 = new Object();

		List<?> l1 = Arrays.asList(example1, example2, example3, example4); // can add example4

		System.out.println(l1.get(2)); // 2424l

		List<? extends GenericType> l2 = Arrays.asList(example1, example2, example3); // can't add example4

		System.out.println(l1.get(1)); // 24

		List<? super GenericType> l3 = Arrays.asList(example1, example2, example3, example4); // can add example4

		System.out.println(l1.get(0)); // Mario

	}
}
