package Collection;
import java.util.*;

interface A {
	void show();
	
}
class B implements A{
	public void show() {
		System.out.println("Hello");
	}
	
}
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> str = new ArrayList<>();
		ArrayList arr = new ArrayList();
		System.out.println("Welcome to List Interface ");
		System.out.println("Arraylist");
		for(int i=0;i<4;i++) {
			int n = sc.nextInt();
			str.add(n);
		}
		System.out.println(str);
		//remove element
		str.remove(1);
		System.out.println ("After removing 1st element List :" + str );
		
		//get for retrive particular and set used for updating 
		System.out.println("get() : " + str.get(2));
		str.set(2,100);
		System.out.println("set() : " + str);
		
		//contains : is present return true / false
		System.out.println("Contains or not : " + str.contains(90));
		
		//sorting element
		Collections.sort(str);
		System.out.println("After sorting : " + str);
	//read element using for
		System.out.println("read element using for each : ");
		for(Object e : str) {
			System.out.println(e);
		}
		
//		read element using iterator
		System.out.println("Read element using Iterator");
		Iterator i = str.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		//llistIterator for backword travels (return reverse list)
		System.out.println("Backward traveling ");
		ListIterator li = str.listIterator(str.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//lambeda function
		
		A obj = ()->{
			System.out.println("hiii");
			
		};
	obj.show();

	}

}
