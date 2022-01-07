package jiov2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {

	public static void main(String[] args) {

		File file = Paths.get("C:\\Users\\.\\JIOText.txt").toFile();
		Path path5 = new File("JIOFile.txt").toPath();

		try {
			Path path1 = Paths.get("C:\\Users\\mario\\Documents\\Eclipse Projects\\SimpleProjects\\"
					+ "Java Certificate Programs\\src\\jiov2\\JIOText.txt");
			Path path3 = Paths.get("C:\\Users\\.\\JIOText.txt");

			System.out.println(path1 + "\n" + path3);
//			C:\Users\mario\Documents\Eclipse Projects\SimpleProjects\Java Certificate Programs\
//			src\jiov2\JIOText.txt
//			C:\Users\.\JIOText.txt

			path3 = path3.normalize();
			System.out.println(path3);
//			C:\Users\JIOText.txt
		} catch (Exception e) {

		}

		Path path2 = Paths.get("C:\\Users", "jiov2\\JIOTextRelative.txt");
		Path path4 = Paths.get("C:\\Users\\jiov2\\..\\JIOText.txt");

		System.out.println(path2 + "\n" + path4);
//		C:\Users\jiov2\JIOTextRelative.txt
//		C:\Users\jiov2\..\JIOText.txt

		path4 = path4.normalize();
		System.out.println(path4);
//		C:\Users\JIOText.txt

		System.out.println(path2.getFileName());
//		JIOTextRelative.txt
		System.out.println(path2.getName(0));
//		Users
		System.out.println(path2.getNameCount());
//		3
		System.out.println(path2.subpath(0, 2));
//		Users\jiov2
		System.out.println(path2.getParent());
//		C:\Users\jiov2
		System.out.println(path2.getRoot());
//		C:\

	}
}
