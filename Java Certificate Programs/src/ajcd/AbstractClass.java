package ajcd;

abstract class Car {

	abstract void saySomething();

	public void sayHello() {

		System.out.println("Hello");
	}

	public static void main(String[] ags) {

		System.out.println("Abstract main method"); // Abstract main method |
													// Runs if you select it

	}

}

public class AbstractClass extends Car {

	@Override
	void saySomething() {
		System.out.println("Something");
	}

	public static void main(String[] ags) {

		AbstractClass car = new AbstractClass();
		car.sayHello(); // Hello
		car.saySomething(); // Something

		System.out.println("Main method"); // Main method

	}
}
