package jcd;

public class EqualsClass {

	private int age;
	private String name;

// getters and setters

	public EqualsClass(int age, String name) {

		this.age = age;
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (obj.getClass() != this.getClass()) {
			return false;
		}

		final EqualsClass other = (EqualsClass) obj;

		if (this.age != other.age) {
			return false;
		}

		if (this.name != other.name) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		EqualsClass instance1 = new EqualsClass(1, "Mario");
		EqualsClass instance2 = new EqualsClass(1, "Mario");

		EqualsClass instance3 = new EqualsClass(2, "Ion");

		System.out.println(instance1.equals(instance2)); // true
		System.out.println(instance1.equals(instance3)); // false

	}

}
