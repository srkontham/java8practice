package org.srk.practice.java8.defaultMethod1;

public class DefaultMethodTest implements MyJ8Interface {
	// Need to override all the abstract methods,
	// but not necessary to override the default methods.
	@Override
	public void foo() {
		System.out.println("run foo() in MyClass");
	}

	public static void main(String[] args) {
		DefaultMethodTest test = new DefaultMethodTest();
		test.foo(); // run foo() in MyClass
		test.bar(); // run default in MyJ8Interface
	}
}
