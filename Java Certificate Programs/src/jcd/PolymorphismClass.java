package jcd;

class Animal {

	public void animalSound() {
		System.out.println("Default animal sound");
	}
}

class Dog extends Animal {

	public void animalSound() {
		System.out.println("WOFH");
	}
}

class Cat extends Animal {

	public void animalSound() {
		System.out.println("MIAW");
	}
}

public class PolymorphismClass {

	public static void main(String[] args) {

		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myDog = new Dog(); // Create a Dog object
		Animal mycat = new Cat(); // Create a Cat object

		myAnimal.animalSound(); // Default animal sound
		myDog.animalSound(); // WOFH
		mycat.animalSound(); // MIAW
	}

}
