package ajcd;

enum Choices {

	EXAMPLE1(1) {

		@Override
		public void saySomething() {
			System.out.println("Something else");
		}

	},
	EXAMPLE2(2), EXAMPLE3(3);

	private int exampleNumber;

	private Choices(int exampleNumber) {

		this.exampleNumber = exampleNumber;

	}

	public int getExampleNumber() {
		return exampleNumber;
	}

	public void saySomething() {
		System.out.println("Something");
	}

}

public class EnumClass {

	public static void main(String[] args) {

		Choices example1 = Choices.EXAMPLE1;

		int exampleNumber = example1.getExampleNumber();

		System.out.println(exampleNumber); // 1
		example1.saySomething(); // Something else

		for (Choices c : Choices.values()) {
			System.out.println(c);
		}

	}
}
