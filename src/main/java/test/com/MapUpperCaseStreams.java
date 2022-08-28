package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUpperCaseStreams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("bus","car","bicycle","train","flight");
		
		List<String> upperCaseNames = new ArrayList<String>();
		
	//without streams - map
		for(String name : names) {
			System.out.println(name.toUpperCase());
		}
		System.out.println("**************");
		
		//with streams-map
		upperCaseNames =names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNames);

	}

}
