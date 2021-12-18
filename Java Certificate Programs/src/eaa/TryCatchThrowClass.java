package eaa;

public class TryCatchThrowClass {

	public static void main(String[] args) {

		try {

			int rez = 10 / 0;
			throw new ArrayIndexOutOfBoundsException("Array not valid");

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {

			e.printStackTrace();
			// java.lang.ArithmeticException: / by zero
			// at eaa.TryCatchThrowClass.main(TryCatchThrowClass.java:9)
		} finally {

			System.out.println("Finally block");

		}

		// Finally block

	}
}
