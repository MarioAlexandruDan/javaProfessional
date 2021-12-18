package jio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamClass {

	public static void main(String[] args) {

		Bicycle bicycle1 = null;
		Bicycle bicycle2 = null;
		Bicycle bicycle3 = null;
		Bicycle bicycle4 = null;
		Bicycle bicycle5 = null;

		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/jio/Bicycle.txt"))) {

			bicycle1 = (Bicycle) input.readObject();
			bicycle2 = (Bicycle) input.readObject();
			bicycle3 = (Bicycle) input.readObject();
			bicycle4 = (Bicycle) input.readObject();
			bicycle5 = (Bicycle) input.readObject();

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}

		System.out.println(bicycle1.getColor()); // Red
		System.out.println(bicycle2.getColor()); // Blue
		System.out.println(bicycle3.getColor()); // Green
		System.out.println(bicycle4.getColor()); // Black
		System.out.println(bicycle5.getColor()); // Yellow

	}
}
