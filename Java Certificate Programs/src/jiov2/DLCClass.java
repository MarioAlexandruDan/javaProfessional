package jiov2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DLCClass {

	public static void main(String[] args) {

		File file = new File("src/jiov2/JIOV2.txt");
		try {
			file.createNewFile(); // file created
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Path path = Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\"
				+ "Java Certificate Programs\\src\\jiov2\\JIOV2.txt");

		Path target = Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\"
				+ "Java Certificate Programs\\src\\jiov2\\JIOV2Copy.txt");
		
		Path lastTarget =  Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\"
				+ "Java Certificate Programs\\src\\jiov2\\JIOV2Moved.txt");

		try {
			Files.copy(path, target); // file created
			Files.move(target, lastTarget); // file moved
			Files.delete(path); // file deleted
			Files.delete(lastTarget); // file deleted
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
