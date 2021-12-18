package ajcd;

@FunctionalInterface
interface Example {

	public void saySomething();

}

public class LambdaClass {

	public static void main(String[] args) {

		Example instance = () -> {

			System.out.println("Something");

		};

		instance.saySomething(); // Something

	}
}
