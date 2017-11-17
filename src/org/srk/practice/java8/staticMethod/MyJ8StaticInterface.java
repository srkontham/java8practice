package org.srk.practice.java8.staticMethod;

public interface MyJ8StaticInterface {
	void foo2(); // abstract public

	static void bar2() { // public
		System.out.println("run static in MyJ8Interface2");
	}

	// static void barX();
	// error: missing method body, or declare abstract
}
