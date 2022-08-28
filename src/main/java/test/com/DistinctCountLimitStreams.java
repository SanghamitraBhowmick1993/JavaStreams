package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountLimitStreams {

	public static void main(String[] args) {
		//distinct //count //limit

		List<String> vehNames = Arrays.asList("bus","car","bicycle","train","flight","car");
		//distinct
		vehNames.stream().distinct().forEach(s -> System.out.println(s));
		//count
		long len = vehNames.stream().distinct().count();
		System.out.println(len);
		
		//limit
		vehNames.stream().limit(3).forEach(s -> System.out.println(s));
	

	}

}
