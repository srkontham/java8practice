package org.srk.practice.java8.collectionLamda;

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

		// Pre JDK 8: Using anonymous inner classes
		ProcessPersonList.FilterReduce(pList, new PersonPredicate() {
			@Override
			public boolean test(Person p) {
				return p.getAge() >= 21; // Filtering criteria
			}
		}, new PersonConsumer() {
			@Override
			public void accept(Person p) {
				p.sayHello(); // Apply this operation
			}
		});

		// JDK 8: Using Lambda Expressions
		ProcessPersonList.FilterReduce(pList, p -> p.getAge() >= 21, p -> p.sayHello());
	}
}
