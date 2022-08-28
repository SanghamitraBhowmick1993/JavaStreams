package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAnyFindFirstStreams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("bus","car","bicycle","car","flight");
		Optional<String> anyVal = names.stream().findAny();
		
		System.out.println(anyVal.get());
		
		//find first
		Optional<String> anyVal1=names.stream().findFirst();
		System.out.println(anyVal1.get());
		//concat
		List<String> animalNames = Arrays.asList("cat","lion","dog");
		List<String> birdsNames = Arrays.asList("parrot","pegion","crow");
		Stream<String> animals = animalNames.stream();
		Stream<String> birds =birdsNames.stream();
		
		Stream.concat(animals, birds).forEach(e -> System.out.println(e));


	}

}
