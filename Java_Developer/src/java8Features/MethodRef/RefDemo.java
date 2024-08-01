package java8Features.MethodRef;

public class RefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method refernce to call existing method
		RefInter ref = doStuff::stuff;

		ref.doTask();
	}

}
