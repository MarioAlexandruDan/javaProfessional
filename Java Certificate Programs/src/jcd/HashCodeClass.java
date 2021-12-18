package jcd;

public class HashCodeClass {

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
	public int hashCode() {
		int result = 4;
		result = 7 * result + name.hashCode();
		result = 7 * result + age;

		return result;
	}

	public static void main(String[] args) {

		HashCodeClass instance = new HashCodeClass();

		instance.setAge(19);
		instance.setName("Mario");

		System.out.println(instance.hashCode());

	}
}
