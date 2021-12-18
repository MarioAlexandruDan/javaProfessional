package gac;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClass {

	public static void main(String[] args) {

		Deque<String> stack = new ArrayDeque<>();

		stack.offer("Mario");
		stack.offer("George");

		stack.add("Ioana"); // *can throw exceptions*

		stack.forEach(System.out::println); // Mario George Ioana

		System.out.println(stack.poll()); // Mario
		System.out.println(stack.remove()); // George *can throw exceptions*

		stack.offerFirst("George");
		stack.offerFirst("Mario");

		stack.forEach(System.out::println); // Mario George Ioana

		System.out.println(stack.peek()); // Mario
		System.out.println(stack.getLast()); // Ioana *can throw exceptions*

		for (String name : stack) {
			System.out.println(name); // Mario George Ioana
		}
	}
}
