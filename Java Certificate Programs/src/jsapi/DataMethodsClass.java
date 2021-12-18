package jsapi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataMethodsClass {

	public static void main(String[] args) {
		Comparator<Integer> mostDivizions = new Comparator<>() {
			@Override
			public int compare(Integer number1, Integer number2) {
				int div1 = 0, div2 = 0;
				for (int i = 1; i <= number1 / 2; i++) {
					if (number1 % i == 0) {
						div1++;
					}
				}
				for (int i = 1; i <= number2 / 2; i++) {
					if (number2 % i == 0) {
						div2++;
					}
				}
				if (div1 > div2) {
					return 1;
				} else if (div1 == div2) {
					return 0;
				} else {
					return -1;
				}
			}
		};

		List<Integer> myList = IntStream.range(1, 100).boxed().collect(Collectors.toList());

		Optional<Integer> rezult1 = myList.stream().max(mostDivizions);
		Optional<Integer> rezult2 = myList.stream().min(mostDivizions);
		long rezult3 = myList.stream().count();

		rezult1.ifPresent(System.out::println); // 60
		rezult2.ifPresent(System.out::println); // 1
		System.out.println(rezult3); // 99
	}
}
