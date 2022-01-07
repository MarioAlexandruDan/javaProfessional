package jiov2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MetadataClass {

	public static void main(String[] args) {

		Path path = Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\"
				+ "Java Certificate Programs\\src\\jiov2\\JIOText.txt");

		System.out.println(Files.isDirectory(path)); // false
		System.out.println(Files.isExecutable(path)); // true
		try {
			System.out.println(Files.isHidden(path)); // false
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Files.isReadable(path)); // true
		System.out.println(Files.isWritable(path)); // true
		try {
			System.out.println(Files.size(path)); // 0
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
