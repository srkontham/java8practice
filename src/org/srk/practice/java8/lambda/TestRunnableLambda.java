package org.srk.practice.java8.lambda;

public class TestRunnableLambda {
	public static void main(String[] args) {
		// Using an anonymous inner class
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Runnable 1");
			}
		};
		// Using a one-liner Lambda Expression for One-Method Interface
		Runnable r2 = () -> System.out.println("Runnable 2");

		r1.run();
		r2.run();
	}
}
