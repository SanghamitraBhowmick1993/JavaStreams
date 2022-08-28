package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapNumberManupulationStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,19,50,20,70);
		
		List<Integer> addedNum = new ArrayList<Integer>();
		
		//without streams
		
		for(int num : numbers) {
			num = num *3;
				System.out.println(num);
			
		}
		System.out.println("**************");
		
		//with streams - map
		addedNum =numbers.stream().map(num -> num *3).collect(Collectors.toList());
		System.out.println(addedNum);
		
		numbers.stream().map(num -> num *3).forEach(n -> System.out.println(n));

	}

}
