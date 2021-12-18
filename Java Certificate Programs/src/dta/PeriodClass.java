package dta;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {

	public static void main(String[] args) {

		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = ld1.withDayOfMonth(25);

		Period p1 = Period.of(1, 2, 20); // years:months:days
		Period p2 = Period.ofYears(2).ofDays(20); // the value gets the last method value

		System.out.println(p1 + " " + p2); // P1Y2M20D P200D

		Period p3 = Period.between(ld1, ld2);

		System.out.println(p3); // P13D

		p3 = p3.plusYears(2);

		LocalDate newDate = ld1.plus(p3); // can't be LocalDateTime
		System.out.println(newDate); // 2023-12-25

	}
}
