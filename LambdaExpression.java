package java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {

	public static void main(String[] args) {

		Predicate<Integer> prtest = new Predicate<Integer>() {

			// Anonymous Class implements Predicate<>

			@Override
			public boolean test(Integer num) {
				if (num > 100) {
					System.out.println("Greater then 100 !!");
				} else {
					System.out.println("Less than 100 !!");
				}
				return false;
			}
		};

		// prtest.test(7);
		
		
		//Using Lambda Expression
		Predicate<Integer> prtestwithlambda = (Integer x) -> (x > 100);
		System.out.println(prtestwithlambda.test(101));

		
		
		
		
		Function<String, String> funct = new Function<String, String>() {

			@Override
			public String apply(String s) {

				// process something

				s = s.toUpperCase();

				return s;
			}
		};
		
		// String caps = funct.apply("hello good morning");
		// System.out.println(caps);
		
		
		//Using Lambda Expression			
		Function<String, String> funct1 = (s)->(s.toUpperCase());
		String cap = funct1.apply("good morning");
		
		System.out.println(cap);
		
		
		
		

		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String s) {

				// Consume something

				System.out.println(s + " from consumer");
			}
		};
		
		// consumer.accept("Good Morning");
		
		//Using Lambda Expression
		Consumer<String> consumer1 = (a)->
		System.out.println(a+" from consumer using lambda expression");
		
		consumer1.accept("Good Morning");
		
		
		
		
		

		Supplier<String> sup = new Supplier<String>() {

			@Override
			public String get() {

				String msg = "Hello from Supplier";

				return msg;
			}
		};

		//String getMsg = sup.get();
		//System.out.println(getMsg);
		
		//Using Lambda Expression
		Supplier<Double> sup1 = ()-> Math.random(); 
		System.out.println(Math.random());
		
		
	}
}
