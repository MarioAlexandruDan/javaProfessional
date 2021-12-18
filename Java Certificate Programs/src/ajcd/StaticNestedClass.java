package ajcd;

class Head {

	static int count = 1;

	public static class Nested {

		public static void sayCount() {
			System.out.println(count);
		}

	}

}

public class StaticNestedClass {

	public static void main(String[] args) {

		Head.Nested.sayCount(); // 1

	}

}
