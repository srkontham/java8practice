package org.srk.practice.java8.collectionLambda2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 * JDK 8 added a new package java.util.function, which contains many standard 
 * Functional Interfaces, including Predicate and Consumer, defined with generic
 */

public class ProcessPersonList {
	// Given a List of Person, filter with predicate, and consume.
	public static void FilterReduce(List<Person> pList,  Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : pList) {
			if (predicate.test(p)) { // Filter
				consumer.accept(p); // Reduce
			}
		}
	}
}
