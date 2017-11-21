package org.srk.practice.java8.collectionLambda;

@FunctionalInterface
public interface PersonPredicate {
   boolean test(Person p);  // Perform this boolean test on the given Person
}
