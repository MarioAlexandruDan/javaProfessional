package jcd;

class Car {

	private int hp;

	public void run() {
		System.out.print("Running");
	}

}

public class AggregationClass {

	public void run() {
		System.out.print("Sprinting");
	}

	public static void main(String[] args) {

		AggregationClass man = new AggregationClass();
		Car volvo = new Car();

		man.run(); // Sprinting
		volvo.run(); // Running
	}

}
