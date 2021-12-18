package ajcd;

public final class FinalClass {

	final static String NAME = "ASUS";

	final int age;

	public FinalClass() {
		age = 1;
	}

	public final void sayHello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		FinalClass instance = new FinalClass();

		System.out.println(instance.age + instance.NAME); // 1ASUS

		instance.sayHello(); // Hello
	}

}
