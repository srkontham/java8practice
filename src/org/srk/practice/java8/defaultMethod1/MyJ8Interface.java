package org.srk.practice.java8.defaultMethod1;

public interface MyJ8Interface {
	void foo(); // abstract public

	// Default methods are marked by keyword "default"
	default void bar() { // public
		System.out.println("run default in MyJ8Interface");
	}

	// default void barX();
	// error: missing method body, or declare abstract
}
