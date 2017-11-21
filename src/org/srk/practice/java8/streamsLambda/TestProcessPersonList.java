package org.srk.practice.java8.streamsLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 * JDK 8 added a Streams API to the Collection framework to support aggregate operations. 
 * This can simplify the above filter-map-reduce to a one-liner. 
 * Furthermore, there is no need for an explicit for-loop.
 * 
 */

public class TestProcessPersonList {
	public static void main(String[] args) {
		// Create a List of Person objects
		List<Person> pList = new ArrayList<>();
		pList.add(new Person("Peter", 21));
		pList.add(new Person("Paul", 60));
		pList.add(new Person("Patrick", 15));
		System.out.println(Arrays.toString(pList.toArray()));
		// [Peter(21), Paul(60), Patrick(15)]

		// Using JDK 8 Stream for filter-reduce
		pList.stream().filter(p -> p.getAge() >= 21).forEach(p -> p.sayHello());
		pList.stream().filter(p -> p.getAge() >= 21).forEach(Person::sayHello); // Using method reference

		// Using map() to extract a specific property from the object
		Predicate<Person> adult = p -> p.getAge() >= 21;
		pList.stream().filter(adult).map(p -> p.getName()).forEach(name -> System.out.println(name));
		pList.stream().filter(adult).map(Person::getName).forEach(System.out::println);

		// Apply aggregate operation average(), sum() to an int property extracted via
		// mapToInt()
		System.out.println(pList.stream().filter(adult).mapToInt(p -> p.getAge()).average().getAsDouble());
		System.out.println(pList.stream().filter(adult).mapToInt(Person::getAge).average().getAsDouble());
		System.out.println(pList.stream().filter(adult).mapToInt(Person::getAge).sum());
	}
}
