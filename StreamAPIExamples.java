package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIExamples {

	public static void main(String[] args) {
		
		List<String> weekdays = Arrays.asList("Monday","Tuesday","Wednesday","Thursday",
				"Friday","Saturday","Sunday");
		
		//1
		for(int i=0; i<weekdays.size();i++) {
			
		}
		
		//2
		for (String day : weekdays) {
			
		}
		
		//3
		//weekdays.stream().forEach(day->System.out.println("Day of the week is "+day));
		
		//System.out.println(weekdays.stream().count());
		
		//Using Method Referance
		//4
		weekdays.stream().forEach(System.out::println);
		
		
		//List<String> distinctweekdays = weekdays.stream().distinct().collect(Collectors.toList());
		
		//distinctweekdays.forEach(day->System.out.println("Day of the week is "+day));
		
		List<String> tnameweekdays = weekdays.stream().filter(day-> day.startsWith("W")).collect(Collectors.toList());
		
		//tnameweekdays.stream().forEach(day->System.out.println("Day of the week start with W is "+day));
		
		
		
		
		List<Integer> marks = Arrays.asList(101, 200, 200, 350,500);

		boolean result = marks.stream().allMatch(num-> num>100);
		//System.out.println("In this list all are greater than 1 "+ result);
	
		if(marks.stream().allMatch(num -> num>100)) {
			//System.out.println("Heyyy wow... Lets party all got more than 100 marks");		
		}else {
			//System.out.println("Soory No Party!!! Some of us are not meeting expectatioins");
		}
		
		
		List<Integer> score = Arrays.asList(1,2,2,4,4,4);

		if(score.stream().anyMatch(num -> num>=6)) {
			//System.out.println("In this over we hit a SIX ");		
		}else {
			//System.out.println("No SIX got hit in this over");
		}
	}
}
