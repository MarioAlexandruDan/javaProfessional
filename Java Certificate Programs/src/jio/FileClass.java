package jio;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {

		File file = new File("src/jio/SomeText.txt");
//		File file = new File(
//			"C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\" +
//			"Java Certificate Programs\\src\\jio\\SomeText.txt");

		System.out.println(file.exists()); // true
		System.out.println(file.mkdir()); // false (It already exists)
		System.out.println(file.length()); // 16 (Some random text)
//		System.out.println(file.renameTo(new File("src/jio/NewFile.txt"))); // true
//		System.out.println(file.delete();); // true
		System.out.println(file.isDirectory()); // false
		System.out.println(file.isHidden()); // false

		if (file.isDirectory()) {
			String[] fileNames = file.list();
			for (String s : fileNames) {
				System.out.println(s);
			}
		} // not a directory
	}
}
