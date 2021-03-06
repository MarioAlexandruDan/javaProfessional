package jio;

import java.io.Console;

public class ConsoleClass {

	public static void main(String[] args) {

		// Create the console object
		Console console = System.console();

		if (console == null) {
			System.out.println("No console available");
			return;
		}

		// Read name
		String name = console.readLine("Enter username : ");

		// Read password
		// into character array
		char[] ch = console.readPassword("Enter password : ");

		// Format username
		console.format("Username : " + name);

		// Print password
		console.printf("\n" + "Password : " + ch);
	}
}
