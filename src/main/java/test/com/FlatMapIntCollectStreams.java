package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapIntCollectStreams {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10,19,50,20,70,35);
		//map
		List<Integer> l2 = l1.stream().map(n -> n+1).collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println("**************");
		
//notes::::
//flatMap takes function as argument, take 1 argument and return stream of objects
//take 1 argument, and return single object
//filter - predicate - takes argument, returns boolean, manupulate data, data may reduce(even,odd)
//map - consumer - takes an argument,does a set of operations, doesnot return anything. action done on same set of data (uppercase,len)
//forEach - consumer - takes an argument and returns nothing, use to iterate,data in various locaions and to get the combined values(e.g. votes)
		
		//flatmap
		List<Integer> l3 = Arrays.asList(10,19);
		List<Integer> l4 = Arrays.asList(50,20);
		List<Integer> l5 = Arrays.asList(70,35);
		
		List<List<Integer>> finalList = Arrays.asList(l3,l4,l5);
		List<Integer> finalVal =finalList.stream().flatMap(n -> n.stream()).map(n -> n+1).collect(Collectors.toList());
		System.out.println(finalVal);

		
	}

}
