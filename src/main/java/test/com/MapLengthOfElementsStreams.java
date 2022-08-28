package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapLengthOfElementsStreams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("bus","car","bicycle","train","flight");
		
		
	//without streams
		for(String name : names) {
			System.out.println(name.length());
		}
		System.out.println("********");
		
		//with streams-map
		names.stream().map(name -> name.length()).forEach(n -> System.out.println(n));

	}

}
