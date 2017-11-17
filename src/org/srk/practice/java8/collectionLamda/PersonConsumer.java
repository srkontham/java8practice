package org.srk.practice.java8.collectionLamda;

@FunctionalInterface
public interface PersonConsumer {
   void accept(Person p);  // Run these operations on the given Person
}
