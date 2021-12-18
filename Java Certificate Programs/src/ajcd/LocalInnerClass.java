package ajcd;

public class LocalInnerClass {

	public static void main(String[] args) {

		class Example {

			private int age;

			public Example(int age) {
				this.age = age;
			}

			public static void saySomething() {
				System.out.println("Something");
			}

			public void sayAge() {
				System.out.println(age);
			}
		}

		Example.saySomething(); // Something

		Example instance = new Example(19);
		instance.sayAge(); // 19

	}

}
