package jcd;

enum Singleton {
	INSTANCE;
}

public class SingletonClass {

	private static SingletonClass INSTANCE;
	private String info = "Information about the instance";

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new SingletonClass();
		}

		return INSTANCE;
	}

//  Thread-safe
//	public synchronized static SingletonClass getInstance() {
//
//		if (INSTANCE == null) {
//			INSTANCE = new SingletonClass();
//		}
//		return INSTANCE;
//	}

	public String getInfo() {
		return info;
	}

	public static void main(String[] Args) {

		System.out.println(SingletonClass.getInstance().getInfo());
		// Information about the instance

	}
}
