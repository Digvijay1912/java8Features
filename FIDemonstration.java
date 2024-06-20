package java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIDemonstration {

	public static void main(String[] args) {
		
		Predicate<Integer> prtest = new Predicate<Integer>() {
			
			//Anonymous Class implements Predicate<>
			
			@Override
			public boolean test(Integer num) {
				if(num >100) {
					System.out.println("Greater then 100 !!");
				}else{
					System.out.println("Less than 100 !!");
				}
				return false;
			}
			
		};
		
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String s) {
				
				//Consume something
				
				System.out.println(s+ " from consumer");
				
			}
			
		};
		
		Function<String, String> funct = new Function<String, String>() {
			
			@Override
			public String apply(String s) {
				
				//process something
				
				s = s.toUpperCase();
			
				return s;
			}
			
		};
		
		Supplier<String> sup = new Supplier<String>() {
			
			@Override
			public String get() {

				String msg = "Hello from Supplier";
				
				return msg;
			}
			
		};
		
		
		//prtest.test(7);
		//consumer.accept("Good Morning");
		
		//String caps = funct.apply("hello good morning");
		//System.out.println(caps);
		
		String getMsg = sup.get();
		System.out.println(getMsg);
	}
}
