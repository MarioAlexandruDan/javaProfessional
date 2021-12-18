package jio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) {

		try (PrintWriter printWriter = new PrintWriter(new FileWriter("src/jio/LastText.txt"))) {

			printWriter.println(true);
			printWriter.print(1.3);
			printWriter.format("\n");
			printWriter.printf("End");
			printWriter.flush();

		} catch (IOException e) {

			e.printStackTrace();
		}
//		true
//		1.3
//		End

	}

}
