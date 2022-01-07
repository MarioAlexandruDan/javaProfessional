package jiov2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamNIOClass {

	public static void main(String[] args) throws IOException {

		try (Stream<Path> stream = Files.list(Paths.get("C:\\Users\\mario\\Pictures\\My edits"))) {
			stream.map(String::valueOf).filter(path -> path.endsWith(".jpg")).forEach(System.out::println);
		}
//		C:\Users\mario\Pictures\My edits\002.jpg
//		C:\Users\mario\Pictures\My edits\003.jpg
//      ...
//		C:\Users\mario\Pictures\My edits\v2.jpg

		try (Stream<Path> stream = Files.find(Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects"), 5,
				(path, attr) -> String.valueOf(path).endsWith(".txt"))) {
			stream.map(String::valueOf).forEach(System.out::println);
		}
//		C:\Users\mario\Documents\Eclipse Projects\SimpleProjects\.metadata\.plugins\org.eclipse.jdt.core\javaLikeNames.txt
//		C:\Users\mario\Documents\Eclipse Projects\SimpleProjects\.metadata\.plugins\org.eclipse.jdt.core\savedIndexNames.txt
//		...
//		C:\Users\mario\Documents\Eclipse Projects\SimpleProjects\Revision\src\loc\PropertiesClassForCmd.txt

		try (Stream<Path> stream = Files.walk(Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects"), 5)) {
			stream.map(String::valueOf).filter(path -> path.endsWith(".txt")).forEach(System.out::println);
		}
//		C:\Users\mario\Documents\Eclipse Projects\SimpleProjects\.metadata\.plugins\org.eclipse.jdt.core\javaLikeNames.txt
//		C:\Users\mario\Documents\Eclipse Projects\SimpleProjects\.metadata\.plugins\org.eclipse.jdt.core\savedIndexNames.txt
//		...
//		C:\Users\mario\Documents\Eclipse Projects\SimpleProjects\Revision\src\loc\PropertiesClassForCmd.txt

		try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\"
				+ "Java Certificate Programs\\src\\jiov2\\JIOTextRelative.txt"))) {
			stream.map(String::toLowerCase).forEach(System.out::println);
//		this is a text.
//		end.
		}
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\"
				+ "SimpleProjects\\Java Certificate Programs\\src\\jiov2\\JIOTextRelative.txt"))) {
		    reader.lines().map(String::toLowerCase).forEach(System.out::println);
//		this is a text.
//      end.
		}
	}
}
