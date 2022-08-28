package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,19,50,20,70);
		
		List<Integer> evennumberList = new ArrayList<Integer>();
		
		//without streams
		
		for(int num : numbers) {
			if(num %2==0) {
				System.out.println(num);
			}
		}
		System.out.println("**************");
		
		//with streams
		evennumberList = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(evennumberList);
		numbers.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
		numbers.stream().filter(n -> n%2==0).forEach(System.out::print);

	}

}
