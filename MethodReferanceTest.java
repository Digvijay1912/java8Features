package java8Features;

interface DisplayInterfaceTest{
	void display();
}

public class MethodReferanceTest {

	
	public void mrtest_nonstatic() {
		
		System.out.println("Hello there from MethodReference class non static method");
		
	}
	
	public static void mrtest() {
		
		System.out.println("Hello there from MethodReference class static method");
		
	}
	
	public MethodReferanceTest() {
		
		System.out.println("Hello there from MethodReference class constructor");
	}
	public static void main(String[] args) {
		
		MethodReferanceTest obj = new MethodReferanceTest();
		
		DisplayInterfaceTest di = ()-> System.out.println("Hello there from lambda's expression");
		
		DisplayInterfaceTest di2 = MethodReferanceTest::mrtest;
		
		DisplayInterfaceTest di3 = obj::mrtest_nonstatic;
		
		DisplayInterfaceTest di4 = MethodReferanceTest::new;

		di.display();
		di2.display();
		di3.display();
		di4.display();
		
		/**
		 * Method reference are of 3 types
		 * 1. Static MR
		 * 
		 * 2. Instance MR 
		 * 
		 * 3. Constructor MR
		 * 
		 */
	}
}
