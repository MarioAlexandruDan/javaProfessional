package loc;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundleClass {

	public static void main(String[] args) {

		Locale defaultLocale = Locale.ITALIAN;
		Locale.setDefault(defaultLocale);
		ResourceBundle rb = ResourceBundle.getBundle("loc//MyBundle");
		String text = rb.getString("text");
		System.out.println(text); // Default Text

		Locale enLocale = new Locale("en");
		Locale.setDefault(enLocale);
		rb = ResourceBundle.getBundle("loc//MyBundle");
		text = rb.getString("text");
		System.out.println(text); // Text in english

		Locale enGBLocale = new Locale("en", "GB");
		Locale.setDefault(enGBLocale);
		rb = ResourceBundle.getBundle("loc//MyBundle");
		text = rb.getString("text");
		System.out.println(text); // Text in english for Great Britain

		Set<String> keys = rb.keySet();
		keys.forEach(System.out::println); // text
		
	}
}
