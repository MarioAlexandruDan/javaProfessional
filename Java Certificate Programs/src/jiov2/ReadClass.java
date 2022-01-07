package jiov2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadClass {

	public static void main(String[] args) {

		Path path = Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\"
				+ "Java Certificate Programs\\src\\jiov2\\JIOTextRelative.txt");

		try {
			byte[] bytes = Files.readAllBytes(path);
			for (byte b : bytes) {
				System.out.print((char) b);
			} // This is a text. End.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();

		try {
			List<String> myList = new ArrayList<>();
			myList = Files.readAllLines(path);
			myList.forEach(System.out::println); // This is a text. End.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
