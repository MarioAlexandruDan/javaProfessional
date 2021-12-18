package loc;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocaleClass {

	public static void main(String[] args) {

		Locale loc = new Locale.Builder().setLanguage("en").setRegion("GB").build(); // Locale.Builder
		System.out.println(loc); // en_GB

		Locale l1 = new Locale("ro", "RO"); // Locale Constructor
		Locale l2 = new Locale("it");
		System.out.println(l1 + " " + l2); // ro_RO it

		Locale lfl = Locale.forLanguageTag("it-IT"); // Locale.forLanguageTag
		System.out.println(lfl); // it_IT

		Locale l3 = Locale.CANADA;
		Locale l4 = Locale.GERMANY;
		System.out.println(l3 + " " + l4 + "\n"); // en_CA de_DE

		Locale locales[] = NumberFormat.getAvailableLocales();
		List<Locale> localeList = new ArrayList<>();
		for (int i = 0; i < locales.length; i++) {
			localeList.add(locales[i]);
		}
		localeList.stream().filter(locale -> locale.toString().contains("ro")).forEach(System.out::println);
//		ro
//		rof_TZ_#Latn
//		rof_TZ
//		ro_MD
//		ro_RO
//		ro_RO_#Latn
//		rof
	}
}
