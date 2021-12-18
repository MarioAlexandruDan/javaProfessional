package jio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Bicycle implements java.io.Serializable {

	private int gears;
	private String color;

	public Bicycle(int gears, String color) {

		this.gears = gears;
		this.color = color;
	}

	public int getGears() {
		return gears;
	}

	public String getColor() {
		return color;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

public class ObjectOutputStreamClass {

	public static void main(String[] args) {

		Bicycle bicycle1 = new Bicycle(4, "Red");
		Bicycle bicycle2 = new Bicycle(3, "Blue");
		Bicycle bicycle3 = new Bicycle(6, "Green");
		Bicycle bicycle4 = new Bicycle(7, "Black");
		Bicycle bicycle5 = new Bicycle(4, "Yellow");

		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/jio/Bicycle.txt"))) {

			output.writeObject(bicycle1);
			output.writeObject(bicycle2);
			output.writeObject(bicycle3);
			output.writeObject(bicycle4);
			output.writeObject(bicycle5);
			output.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
