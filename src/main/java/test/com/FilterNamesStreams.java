package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesStreams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sang","tom","mikey","jaffery","katherinaa");
		
		List<String> longnames = new ArrayList<String>();
		
		longnames =names.stream().filter(n -> n.length()<6 && n.length()<8).collect(Collectors.toList());
		System.out.println(longnames);
		
		System.out.println("*******");
		
		List<String> namesList = Arrays.asList("sang",null,"tom","mikey",null,"jaffery","katherinaa");
		namesList.stream().filter(n -> n != null).forEach(n -> System.out.println(n));


	}

}
