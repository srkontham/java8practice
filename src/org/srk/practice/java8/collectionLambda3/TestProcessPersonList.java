package org.srk.practice.java8.collectionLambda3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestProcessPersonList {
	public static void main(String[] args) {
		// Create a List of Person objects
		List<Person> pList = new ArrayList<>();
		pList.add(new Person("Peter", 21));
		pList.add(new Person("Paul", 60));
		pList.add(new Person("Patrick", 15));
		System.out.println(Arrays.toString(pList.toArray()));
		// [Peter(21), Paul(60), Patrick(15)]

		ProcessPersonList.FilterReduce2(pList, 
										p -> p.getAge() >= 21, 
										p -> p.getName(),
										name -> System.out.println(name));
		/*
		 * JDK 8 introduced a new operator :: to reference a method 
		 * without invoking it - called Method Reference.
		 */
		
		// Using method references 
		ProcessPersonList.FilterReduce2(pList, p -> p.getAge() >= 21, Person::getName, System.out::println);
	}
}
