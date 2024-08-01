package Collection;

import java.util.Iterator;

public class example {

	public static String First(String str) {
		StringBuilder builder = new StringBuilder();
		String[] str1 = str.split(" ");
		
		for (String str3:str1) {
			if(!str3.isEmpty()) {
				builder.append(str3.charAt(0));
			}
		}
		
		return builder.toString();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Kajal mule cognizant";
		String output = First(input);
		System.out.println(output);

	}

}
