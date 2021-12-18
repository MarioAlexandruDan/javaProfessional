package eaa;

public class AssertionClass {

	public static void main(String[] args) {

		int i = -1;

		assert i > 0;
//		Exception in thread "main" java.lang.AssertionError
//        at eaa.AssertionClass.main(AssertionClass.java:9)

		// or
		assert i > 0 : "Parameter i must be a positive value";
//		Exception in thread "main" java.lang.AssertionError: Parameter i must be a positive value
//        at eaa.AssertionClass.main(AssertionClass.java:14)

	}

}
