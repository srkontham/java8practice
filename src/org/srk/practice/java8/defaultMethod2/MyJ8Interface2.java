package org.srk.practice.java8.defaultMethod2;

public interface MyJ8Interface2 {
	void foo1(); // abstract public

	// Same signature (but different implementation) as the default method in
	// MyJ8Interface
	default void bar() { // public
		System.out.println("run default in MyJ8Interface1");
	}
}
