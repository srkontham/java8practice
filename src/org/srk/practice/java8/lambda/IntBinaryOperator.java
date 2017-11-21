package org.srk.practice.java8.lambda;

/*
 * Let's define a Functional Interface to denote 
 * a binary operator (such as add and subtract), as follows: 
 */

@FunctionalInterface
public interface IntBinaryOperator {
	int apply(int left, int right);
}
