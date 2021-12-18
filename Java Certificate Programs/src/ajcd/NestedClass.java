package ajcd;

class HeadClass {

	class LocalNested {

		private int age;

		public LocalNested(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

}

public class NestedClass {

	public static void main(String[] args) {

		HeadClass headInstance = new HeadClass();

		HeadClass.LocalNested instance = headInstance.new LocalNested(19);

		System.out.println(instance.getAge()); // 19

	}
}
