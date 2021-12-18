package jcd;

interface Day {

//	private int hours; only public, static & final are permitted

	public int hours = 24;

	public void sayDay();

	abstract public void sayDays();

	default public void predefinedMethodDay() {
		System.out.println("Day");
	}

	static void predefinedMethodDayStatic() {
		System.out.println("DayStatic");
	}

}

public class ImplementationClass implements Day {

	@Override
	public void sayDay() {
		predefinedMethodDay();
	}

	@Override
	public void sayDays() {
		predefinedMethodDay();
	}

	public static void main(String[] argss) {

		ImplementationClass instance = new ImplementationClass();
		instance.sayDay(); // Day
		instance.sayDays(); // Day
		Day.predefinedMethodDayStatic(); // DayStatic
		System.out.println(instance.hours); // 24

	}
}