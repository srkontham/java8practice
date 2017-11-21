package org.srk.practice.java8.collectionLambda3;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Suppose that instead of operating on the filtered List (of Person objects), 
 * we want to operate on a certain property of Person (e.g., name), 
 * then we need to add a mapper or transformer (i.e., Filter-Map-Reduce pattern). 
 * We shall use the standard Functional Interface java.util.function.Function as our mapper.
 * 
 */

public class ProcessPersonList {
	// Given a List, filter with predicate, apply mapper, and reduce (filter-map-reduce)
	public static void FilterReduce2(List<Person> pList, 
										Predicate<Person> predicate, 
										Function<Person, String> mapper, 
										Consumer<String> consumer) {
		for (Person p : pList) {
			if (predicate.test(p)) {
				String s = mapper.apply(p); // Apply mapper to transfom Person to String
				consumer.accept(s);
			}
		}
	}
}
