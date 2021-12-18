package dta;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZonesClass {

	public static void main(String[] args) {

		ZoneId id = ZoneId.of("Europe/Bucharest"); // Europe/Bucharest
		ZoneOffset zof = ZoneOffset.ofHours(2); // +02:00
		System.out.println(id + "\n" + zof);

		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt, id);
		System.out.println(zdt1); // 2021-12-12T22:40:27.118130500+02:00[Europe/Bucharest]

		OffsetDateTime osdt = OffsetDateTime.of(ldt, zof);
		System.out.println(osdt); // 2021-12-12T22:40:27.118130500+02:00

		LocalTime lt = LocalTime.now();
		OffsetTime ost = OffsetTime.of(lt, zof);
		System.out.println(ost); // 22:43:57.055008700+02:00

		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock); // SystemClock[Europe/Bucharest]

		Clock modifiedClock = Clock.system(ZoneId.of("Europe/Paris"));
		System.out.println(modifiedClock); // SystemClock[Europe/Paris]
	}
}
