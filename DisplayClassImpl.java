package java8Features;

public class DisplayClassImpl implements DisplayInterface{

	
	public static void main(String[] args) {
		System.out.println("Test class created for Functional Interaces");
	
		new DisplayClassImpl().sayHello();
		
		new DisplayClassImpl().sayGoodMorning();
		
		DisplayInterface.sayStatisGoodMorning();
		
	}

	@Override
	public void sayHello() {
		System.out.println("Hello from class");
		
	}

	
	public void simpleMethod() {
		System.out.println("Simple method of class itself");
	}

}
