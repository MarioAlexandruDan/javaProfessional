package dta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingClass {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.of(2021, 12, 25, 8, 30, 10);
		String dateFormatted1 = ldt.format(DateTimeFormatter.BASIC_ISO_DATE);

		System.out.println(dateFormatted1); // 20211225

		String dateFormatted2 = ldt.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));

		System.out.println(dateFormatted2); // 2021/12/25
	}

}
