package jcd;

public class ToStringClass {

	private int age;
	private String name;

// getters

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Formatted String : " + age + " " + name;
	}

	public static void main(String[] args) {

		ToStringClass instance = new ToStringClass();

		instance.setAge(19);
		instance.setName("Mario");

		System.out.println(instance); // Formatted String : 19 Mario

	}

}
