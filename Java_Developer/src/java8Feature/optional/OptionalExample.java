package java8Feature.optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {

		String str = "kajal";
		Optional<String> optional = Optional.ofNullable(str);

		// check string is empty or not
		System.out.println(optional.isEmpty());

		// check string is present or not if present then return true
		System.out.println(optional.isPresent());

		// to retrive or get value use get()
		System.out.println(optional.get());

		// orElse is used is string is null then return else result...it work like if
		// else
		System.out.println(optional.orElse("The string empty or null"));
	}

}
