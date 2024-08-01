package Collection;
import java.util.*;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> courses = new HashMap();
		
		courses.put("java", 30000);
		courses.put("c", 40000);
		courses.put("python", 34000);
		
		System.out.println(courses);
		
		
		System.out.println("getting key value : " + courses.get("c"));
		System.out.println("value set are : " + courses.entrySet());
		
		//foreach
		courses.forEach((e1,e2) ->{
			System.out.println(e1 +"\t" + e2);
		});
		

	}

}
