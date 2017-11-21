package org.srk.practice.java8.collectionLambda;

@FunctionalInterface
public interface PersonConsumer {
   void accept(Person p);  // Run these operations on the given Person
}
