package java8Features;

@FunctionalInterface
public interface DisplayInterface {

	void sayHello();
	
	default void sayGoodMorning() {
		System.out.println("Good Morning from default Method");
	}
	
	static void sayStatisGoodMorning() {
		System.out.println("Good Morning from Static Method");
	}
	
	/**
	 * 
	 * 1. Any interface annotated by @functionalInterface is FI 
	 * 2. Any Interface having only and only one method (abstract method) SAM (single abstract method)
	 * 
	 * 
	 */
}
