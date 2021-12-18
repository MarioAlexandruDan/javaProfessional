package loc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		InputStream input = PropertiesClass.class.getClassLoader().getResourceAsStream("loc/config.properties");
		
		prop.load(input);
		System.out.println(prop.getProperty("name"));
	}

}
