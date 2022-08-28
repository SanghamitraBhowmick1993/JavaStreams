package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class FilterInObjectsStreams {
	
	

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"HP",25000));
		productList.add(new Product(2,"Dell",35000));
		productList.add(new Product(3,"Lenovo",45000));
		productList.add(new Product(4,"HP",30000));
		
		productList.stream().filter(n -> n.price > 25000).forEach(pr -> System.out.println(pr.price + " " + pr.name));



	}

}
