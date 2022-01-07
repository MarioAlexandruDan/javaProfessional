package jiov2;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckFilesClass {

	public static void main(String[] args) {

		Path path = Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\"
				+ "Java Certificate Programs\\src\\jiov2\\JIOText.txt");
		System.out.println(Files.exists(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS }));
		// true
	}

}
