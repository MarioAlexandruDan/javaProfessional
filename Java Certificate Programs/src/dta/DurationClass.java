package dta;

import java.time.Duration;
import java.time.LocalTime;

public class DurationClass {

	public static void main(String[] args) {

		Duration d1 = Duration.ofHours(12);
		Duration d2 = d1.withSeconds(30).withNanos(5005);

		LocalTime t1 = LocalTime.now();
		LocalTime t2 = t1.withHour(10);

		Duration d3 = Duration.between(t1, t2);

		System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n");
//		PT240H
//		PT30.000005005S
//		PT-11H

		LocalTime t3 = t1.plus(d1);
		System.out.println(t3);
//		09:02:00.182480600
	}
}
