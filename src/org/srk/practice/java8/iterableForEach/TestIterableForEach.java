package org.srk.practice.java8.iterableForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestIterableForEach {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		pList.add(new Person("Peter", 21));
		pList.add(new Person("Paul", 60));
		pList.add(new Person("Patrick", 15));
		System.out.println(Arrays.toString(pList.toArray()));

		// Pre JDK 8: Using for-loop
		for (Person p : pList) {
			System.out.println(p);
			System.out.println(p.getName());
		}

		// Using Lambda Expression
		pList.forEach(p -> System.out.println(p));
		pList.forEach(p -> System.out.println(p.getName()));
		pList.forEach(p -> p.sayHello());

		// Using Method Reference
		pList.forEach(System.out::println);
		pList.forEach(Person::sayHello);
	}
}
