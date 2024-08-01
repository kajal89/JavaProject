package Java8.Feature.Lambda;

class A{
	public void a1() {
		System.out.println("hi");
	}
	private void a2() {
		System.out.println("by");
	}
}
class B extends A{
	public void a1() {
		System.out.println("hii1");
		a2();
	}
	private void a2() {
		// TODO Auto-generated method stub
		System.out.println("by2");

	}
}
public class LamdaExpression {

	public static void main(String[] args) {
	
		A a3 = new B();
		a3.a1();
	B b1 = new B();
	b1.a1();
	//b1.a2();
		
		
		Functional impl = (a,b)->{
			
			System.out.println("This is Lambda Hello!!" + (a+b));
			
		};
		
		impl.sayHello(10,20);
		System.out.println(15 * 30 + "Kajal");
		System.out.println("Kajal" + 15 * 30 );
		
		
	}

}
