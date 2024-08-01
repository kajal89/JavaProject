package Collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InterviewCode {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * fing common elemenet in array int[] arr1 = { 10, 50, 89, 55, 90 }; int[] arr2
		 * = { 89, 44, 30, 10, 50 };
		 * 
		 * Set<Integer> set = new HashSet<>();
		 * 
		 * for(int i=0;i<arr1.length;i++) { set.add(arr1[i]); } for(int
		 * i=0;i<arr2.length;i++) { if(set.contains(arr2[i])) {
		 * System.out.println(arr2[i] + " "); } }
		 */

		// find common element in 2 list
		List<Integer> list1 = List.of(10, 50, 89, 55, 90);
		List<Integer> list2 = List.of(89, 44, 30, 10, 50);

		Set<Integer> set = new HashSet<>();
		list1.stream().forEach(e -> {
			set.add(e);

		});

		// itrate list 2 and find common element using foreach
		list2.stream().forEach(e -> {
			if (set.contains(e)) {
				System.out.println(e);
			}

		});

		// find common using filter
		List<Integer> collect = list2.stream().filter(e -> set.contains(e)).collect(Collectors.toList());

		System.out.println(collect);
		
		
	
	}

	
	

}
