package jcd;

class Engine {

	private int hp;

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

}

public class CompositionClass {

	private int seats;
	private int wheels;

	private Engine engine;

	public CompositionClass(int seats, int wheels, int hp) {

		this.seats = seats;
		this.wheels = wheels;
		this.engine = new Engine();
		engine.setHp(hp);
	}

	public static void main(String[] args) {

		CompositionClass volvo = new CompositionClass(5, 4, 100);

		System.out.println(volvo.engine.getHp()); // 100
	}

}
