package jcd;

class Man {

	private static String planet = "Earth";
	private int age;

	public Man(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlanet() {
		return planet;
	}

	public void display() {
		System.out.println(age + " " + planet);
	}

	public static void sayPlanet() {
		System.out.println(planet);
	}

	public static class Organ {

		public static void sayPlanet() {
			System.out.println("I'm form planet " + planet);
		}

	}

}

public class StaticClass {

	static {
		System.out.println("Static Block");
	}

	public StaticClass() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {

		new StaticClass();
		System.out.println("Main Class");
//		Static Block
//		Constructor
//		Main Class

		Man man = new Man(19);
		man.display(); // 19 Earth

		Man.Organ eye = new Man.Organ();
		eye.sayPlanet(); // I'm form planet Earth
	}
}
