package org.srk.practice.java8.lamda;

/*
 * The method operate() takes 2 int's and an object of the Functional Interface  
 * as parameters, and carries out the binary operation.
 */

public class FunctionalMathOperation {
	public int operate(int left, int right, IntBinaryOperator op) {
		return op.apply(left, right);
	}

	public IntBinaryOperator add = (a, b) -> a + b;
	public IntBinaryOperator sub = (a, b) -> a - b;
	public IntBinaryOperator mul = (a, b) -> a * b;
	public IntBinaryOperator div = (a, b) -> a / b;

	// Test Driver
	public static void main(String args[]) {
		FunctionalMathOperation op = new FunctionalMathOperation();
		System.out.println("8 + 9 = " + op.operate(8, 9, op.add));
		System.out.println("8 - 9 = " + op.operate(8, 9, op.sub));
		System.out.println("8 x 9 = " + op.operate(8, 9, op.mul));
		System.out.println("8 / 9 = " + op.operate(8, 9, op.div));
		System.out.println("2 ^ 5 = " + op.operate(2, 5, (a, b) -> (int) Math.pow(a, b)));
	}
}
