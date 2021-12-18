package dta;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TemporalUnitClass {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		LocalDate ldp = ld.withYear(2019);

		System.out.println(ChronoUnit.YEARS.between(ld, ldp)); // -2

	}
}
