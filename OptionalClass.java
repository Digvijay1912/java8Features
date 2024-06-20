package java8Features;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		OptionalClass obj1 = new OptionalClass();
		
		//obj.display();
		
		Optional<OptionalClass> obj = Optional.ofNullable(obj1);
				
				if(obj.isPresent()) {
					obj1.display();
				}else {
					System.out.println("obj is null");
				}
	}
	
	public void display() {
		
		System.out.println("From display method");
	}
}
