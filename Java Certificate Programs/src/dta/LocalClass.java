package dta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalClass {

	public static void main(String[] args) {

		LocalTime lt = LocalTime.now();
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.of(ld, lt);

		System.out.println(lt + "\n" + ld + "\n" + ldt + "\n");
//		20:08:58.728508300
//		2021-12-12
//		2021-12-12T20:08:58.728508300

		LocalTime lt1 = LocalTime.of(20, 10, 14); // hours:minutes:seconds.miliseconds
		LocalTime lt2 = LocalTime.parse("20:00:00");

		LocalDate ld1 = LocalDate.of(2021, 12, 25); // year:month:day
		LocalDate ld2 = LocalDate.ofEpochDay(365 * 41); // 1970-01-01

		System.out.println(lt1 + "\n" + lt2 + "\n" + ld1 + "\n" + ld2 + "\n");
//		20:10:14
//		20:00
//		2021-12-25
//		2010-12-22

		int day = LocalDate.now().getDayOfMonth();
		int month = LocalDate.now().getMonthValue();
		int year = LocalDate.now().getYear();
		Month monthClass = LocalDate.now().getMonth();

		System.out.println(day + "\n" + month + "\n" + year + "\n" + monthClass + "\n");
//		12
//		12
//		2021
//		DECEMBER

		int hour = LocalTime.now().getHour();
		int minute = LocalTime.now().getMinute();
		int second = LocalTime.now().getSecond();
		int nano = LocalTime.now().getNano();

		System.out.println(hour + "\n" + minute + "\n" + second + "\n" + nano + "\n");
//		20
//		21
//		2
//		638591100

		LocalDateTime thePast = ldt.withDayOfMonth(10).withHour(10).withMinute(10);
		System.out.println(thePast + "\n");
//		2021-12-10T10:10:05.692696500

		LocalDateTime calculations = ldt.plusDays(13).plus(2, ChronoUnit.HOURS);
		System.out.println(calculations + "\n");
//		2021-12-25T22:24:52.342050900
	}

}
