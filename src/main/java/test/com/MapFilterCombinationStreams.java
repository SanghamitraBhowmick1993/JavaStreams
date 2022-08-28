package test.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empid;
	String empName;
	int salary;
	
	public Employee(int empid,String empName,int salary) {
		this.empid=empid;
		this.empName=empName;
		this.salary=salary;
	}
}
public class MapFilterCombinationStreams {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee(1, "john", 25000),
				new Employee(2, "tom", 15000),
				new Employee(3, "lisa", 35000),
				new Employee(4, "raj", 40000)
				);
		
		List<String> salary =  empList.stream().filter(n -> n.salary > 20000).map(e -> e.salary + " " + e.empName).collect(Collectors.toList());
		System.out.println(salary);

	}

}
