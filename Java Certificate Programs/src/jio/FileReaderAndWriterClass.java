package jio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderAndWriterClass {

	public static void main(String[] args) {

		try (Writer writer = new FileWriter("src/jio/NewText.txt")) {

			writer.write("Text From a new file writer");

		} catch (IOException e) {

			e.printStackTrace();
		}

		// Do not forget if you use normal try-catch block to close the reader and
		// writer

		try (Reader reader = new FileReader("src/jio/NewText.txt")) {

			int data = reader.read();
			while (data != -1) {
				char dataChar = (char) data;
				System.out.print(dataChar);
				data = reader.read();
			} // Text From a new file writer

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
