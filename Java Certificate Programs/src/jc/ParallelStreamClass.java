package jc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ParallelStreamClass {

	public static void main(String[] args) {

		Stream.of(1, 2, 3, 4, 5).parallel().forEach(System.out::println); // 3 5 4 1 2

		List<String> myList = new ArrayList<>();
		myList.add("Mario");
		myList.add("Mihai");
		myList.add("George");
		myList.add("Flavius");
		myList.add("Roger");

		myList.parallelStream().map(name -> "My name is : " + name).forEach(System.out::println);
//		My name is : George
//		My name is : Flavius
//		My name is : Mihai
//		My name is : Roger
//		My name is : Mario

		Optional<String> rezult = myList.parallelStream().reduce((a, b) -> a + " " + b);

		if (rezult.isPresent()) {
			System.out.println(rezult.get()); // Mario Mihai George Flavius Roger
		}
	}
}
