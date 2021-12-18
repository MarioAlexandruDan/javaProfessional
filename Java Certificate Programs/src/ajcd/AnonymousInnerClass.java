package ajcd;

interface Model {

	public void sayModel();

	default void sayHello() {
		System.out.println("Hello World");
	}

}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Model instance = new Model() {

			@Override
			public void sayModel() {
				System.out.println("Model");
			}

			@Override
			public void sayHello() {
				System.out.println("Hello");
			}

		};

		instance.sayModel(); // Model
		instance.sayHello(); // Hello

	}

}
