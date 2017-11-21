package org.srk.practice.java8.collectionLambda2;

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

		// Using JDK 8 standard functional interfaces Predicate<T> and Consumer<T>
		ProcessPersonList.FilterReduce(pList, p -> p.getAge() >= 21, p -> p.sayHello());
	}
}
