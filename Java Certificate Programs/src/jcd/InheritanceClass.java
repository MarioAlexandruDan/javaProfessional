package jcd;

class Child {

	int age; // default
	protected static String cnp;
	public boolean happy;
	private static final String COUNTRY = "Romania";

	public void sayHelloWorld() {
		System.out.println("Hello World");
	}

	private void trySayHelloWorld() {
		System.out.println("Hello World");
	}

}

public class InheritanceClass extends Child {

	public static void main(String[] args) {

		InheritanceClass man = new InheritanceClass();

		System.out.println(man.age); // 0
		System.out.println(Child.cnp); // null
		System.out.println(man.happy); // false

//		System.out.println(Child.COUNTRY); "The field Child.COUNTRY is not visible"

		man.sayHelloWorld();

//		man.trySayHelloWorld(); " The method trySayHelloWorld() from the type Child is not visible"
	}

}
