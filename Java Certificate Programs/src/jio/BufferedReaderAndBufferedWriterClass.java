package jio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderAndBufferedWriterClass {

	public static void main(String[] args) {

		try (Reader reader = new BufferedReader(new FileReader("src/jio/AnotherNewText.txt"));
				Writer writer = new BufferedWriter(new FileWriter("src/jio/MoreNewText.txt"))) {
			int dataReader = reader.read();
			while (dataReader != -1) {
				char charData = (char) dataReader;
				writer.write(charData); // Text From a new file writer // Text From a new file writer
				System.out.print(charData);
				dataReader = reader.read();
			} // Text From a new file writer // Text From a new file writer
			writer.flush();

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("\n");

		try (Reader reader = new BufferedReader(new FileReader("src/jio/AnotherNewText.txt"), 1024);
				Writer writer = new BufferedWriter(new FileWriter("src/jio/MoreNewText.txt", true), 1024)) {

			char[] charReader = new char[1024];
			reader.read(charReader);
			writer.write("\n");
			for (char c : charReader) {
				System.out.print(c); // Text From a new file writer // Text From a new file writer
				writer.write(charReader); // Text From a new file writer // Text From a new file writer * 1024
			}
			writer.flush();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
