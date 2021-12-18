package jcd;

public class ImmutableClass {

	private final int value;

	public ImmutableClass(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public ImmutableClass setValue(int value) {
		return new ImmutableClass(value);
	}

	public static void main(String[] args) {

		ImmutableClass instance = new ImmutableClass(10);

		System.out.println(instance.getValue()); // 10
		System.out.println(instance.setValue(200).getValue()); // 200
		System.out.println(instance.getValue()); // 10
	}

}
