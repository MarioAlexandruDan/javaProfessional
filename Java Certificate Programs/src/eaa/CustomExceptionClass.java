package eaa;

class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}

}

class MyRuntimeExeption extends RuntimeException {

	public MyRuntimeExeption(String message) {
		super(message);
	}

}

public class CustomExceptionClass {

	public static void main(String args[]) {

		try {
			throw new MyException("My exeption message");
		} catch (MyException e) {

			e.printStackTrace();
//			eaa.MyException: My exeption message
//			at eaa.CustomExceptionClass.main(CustomExceptionClass.java:16)

			throw new MyRuntimeExeption("My runtime exception");

//			Exception in thread "main" eaa.MyRuntimeExeption: My runtime exception
//			at eaa.CustomExceptionClass.main(CustomExceptionClass.java:30)

		}

	}
}
