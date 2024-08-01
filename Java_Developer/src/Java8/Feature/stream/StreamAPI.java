package Java8.Feature.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {

		// It is a immutable in java List.of()
		List<Integer> list = List.of(10, 22, 80, 99, 76);

		Stream<Integer> stream = list.stream();

		// stream filter() used to findout condition
		List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);

		// iterate list using stream
		List<Integer> collect2 = list.stream().collect(Collectors.toList());
		System.out.println("Elements greater that 50 = " + collect2);

		// iterate using for each
		Stream<List<Integer>> of = Stream.of(list);
		of.forEach(e -> {
			System.out.println(e);
		});

		Stream<Integer> stream2 = list.stream();
		stream2.forEach(a -> {
			System.out.println(a);
		});

		List<String> names = List.of("Kajal", "Soma", "Swapnil", "Sunil");
		List<String> collect3 = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());

		System.out.println(collect3);

		//map()
		List<Integer> map = list.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println("squre of num : " + map);
		
		// sorted() used to sort data
		list.stream().sorted().forEach(System.out::println);
		
		//min and max
		Integer min = list.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("min = " + min);

	}

}
