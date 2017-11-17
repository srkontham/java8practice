package org.srk.practice.java8.collectionLamda;

@FunctionalInterface
public interface PersonPredicate {
   boolean test(Person p);  // Perform this boolean test on the given Person
}
