package jio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamAndFileOutputStreamClass {

	public static void main(String[] args) {

		try (FileInputStream input = new FileInputStream("src/jio/NewText.txt");
				FileOutputStream output = new FileOutputStream("src/jio/AnotherNewText.txt") /* overrides the file
				("File", true) appends the file | ("File", false) overrides the file */) {

			int byteData = input.read();
			while (byteData != -1) {
				output.write(byteData); // T e x t   F r o m   a   n e w    f i l e   w r i t e r 
				char charData = (char) byteData;
				System.out.print(charData);
				byteData = input.read();
			}
			output.flush();

		} catch (IOException e) {

			e.printStackTrace();
		} // Text From a new file writer

		System.out.println();

		try (FileInputStream input = new FileInputStream("src/jio/NewText.txt");
				FileOutputStream output = new FileOutputStream("src/jio/AnotherNewText.txt", true)) {

			byte[] data = new byte[1024];
			input.read(data);
			output.write((byte) '\n');
			for (byte b : data) {
				output.write(b); // T e x t   F r o m   a   n e w    f i l e   w r i t e r 
				char charData = (char) b;
				System.out.print(charData);
			}
			output.flush();

		} catch (IOException e) {

			e.printStackTrace();
		} // Text From a new file writer

	}
}
