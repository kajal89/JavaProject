package com.JDBC_java;

import java.util.*;
public class listex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //List<String> list1 = new ArrayList<>();
		List<String> list2 = Arrays.asList("AB", "CD", "EF");
		List<String> list3 = new ArrayList<>();
		list2.stream().forEach(list3::add);
		System.out.println(list3);
		
	}

}
