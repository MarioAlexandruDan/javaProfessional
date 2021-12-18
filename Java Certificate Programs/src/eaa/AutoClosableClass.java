package eaa;

import java.io.Closeable;
import java.io.IOException;

class MyClosable implements Closeable {

	public void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void close() throws IOException {
		System.out.println("Closed! Closeable");
	}
}

class MyAutoClosable implements AutoCloseable {

	public void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closed! AutoCloseable");
	}
}

public class AutoClosableClass {

	public static void main(String[] args) {

		try (MyAutoClosable instance = new MyAutoClosable(); MyClosable instance2 = new MyClosable()) {

			instance.sayHello(); // Hello
			instance2.sayHello(); // Hello

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Closed! Closeable
		// Closed! AutoCloseable
	}

}
