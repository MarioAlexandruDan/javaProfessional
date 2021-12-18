package dta;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantClass {

	public static void main(String[] args) {

		Instant now = Instant.now();
		Instant afterSomeTime = Instant.ofEpochSecond(1000000000);

		System.out.println(now + "\n" + afterSomeTime + "\n");
//		2021-12-12T18:36:33.019596Z
//		2001-09-09T01:46:40Z

		long seconds = now.getEpochSecond();
		int nano = now.getNano();
		System.out.println(seconds + "\n" + nano + "\n");
//		1639334310
//		452915300

		Instant hundredSecondsAfter = now.minus(100000000, ChronoUnit.SECONDS);
		System.out.println(hundredSecondsAfter + "\n");
//		2018-10-12T08:54:48.669022400Z
	}

}
