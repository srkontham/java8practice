package org.srk.practice.java8.collectionLambda;

import java.util.List;

public class ProcessPersonList {
	// Given a List of Person, filter with predicate, and consume.
	public static void FilterReduce(List<Person> pList, PersonPredicate predicate, PersonConsumer consumer) {
		for (Person p : pList) {
			if (predicate.test(p)) { // Filter
				consumer.accept(p); // Reduce
			}
		}
	}
}
