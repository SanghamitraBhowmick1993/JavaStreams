package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class MinMaxNumbersStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,19,50,20,70);
		//count
		long divByZero =numbers.stream().filter(n -> n%2 ==0).count();
		System.out.println(divByZero);
		
		//min
		
		Optional <Integer> minn = numbers.stream().min((val1,val2) ->{
			return val1.compareTo(val2);
		});
		System.out.println(minn.get());
		//max
		Optional <Integer> maxx = numbers.stream().max((val1,val2)->{
			return val1.compareTo(val2);
		});
		
		System.out.println(maxx.get());
		System.out.println("****************");
		//sorted for int
		numbers.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println("****************");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		System.out.println("****************");
		//sorted for string
		List<String> teamA = Arrays.asList("raj","mike","jason");
		teamA.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println("****************");
		teamA.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		System.out.println("****************");

		//any match
		Set<String> fruits = new HashSet<String>();
		fruits.add("One apple");
		fruits.add("Two apple");
		fruits.add("One apple");
		fruits.add("More guava");
		fruits.add("More grape");
		boolean result = fruits.stream().anyMatch(s -> {
			return s.startsWith("One");
		});

		System.out.println(result); //true
		
		//all match
		System.out.println("****************");
		boolean result1 =fruits.stream().allMatch(s -> {
			return s.startsWith("One");
		});
		System.out.println(result1); //false
		System.out.println("****************");
		//none match
		boolean result2 =fruits.stream().noneMatch(v -> {
			return v.startsWith("One");
		});
		System.out.println(result2); //false
		System.out.println("****************");

	}

}
