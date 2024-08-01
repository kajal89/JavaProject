package Collection;
import java.util.*;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		HashSet hash = new HashSet();
		
		for(int i=0;i<5;i++) {
			int n= sc.nextInt();
			hash.add(n);
		}
		System.out.println("Elements in HashSet");
		Iterator i = hash.iterator();
		while(i.hasNext()) {
			System.out.println(i.next() + "\t");
		}
		
		hash.add(99);
		System.out.println(hash + "\t");
		
//		tree set example 
		TreeSet<Integer> tree = new TreeSet();
		tree.addAll(hash);
		System.out.println("tree set elements are" + tree);
		
		
		//foreach fo read element
		System.out.println("read elemenet using ForEach");
		tree.forEach(e->{
			System.out.println(e);
		});

	}

}
