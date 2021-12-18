package jsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapClass {

	public static void main(String[] args) {

		Function<Integer, String> fromIntegerToString = number -> "The number is : " + number;

		List<Integer> integerList = new ArrayList<>();

		integerList.addAll(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toList()));

		integerList.stream().map(fromIntegerToString).forEach(System.out::println);
//		The number is : 1
//		The number is : 2
//		The number is : 3
//		The number is : 4
//		The number is : 5
//		The number is : 6
//		The number is : 7
//		The number is : 8
//		The number is : 9
//		The number is : 10

		ToIntFunction<Integer> transformToInt = number -> (int) number;

		int rezult = integerList.stream().mapToInt(transformToInt).sum();

		System.out.println(rezult); // 55
	}
}
