package org.srk.practice.java8.defaultMethod2;

public class DefaultMethodTest2 implements MyJ8Interface, MyJ8Interface2 {
	@Override
	public void foo() {
		System.out.println("run foo() in MyClass1");
	}

	@Override
	public void foo1() {
		System.out.println("run foo1() in MyClass1");
	}

	@Override
	public void bar() {
		System.out.println("Run default in MyClass1");
	}
	// bar() exists in both interfaces. Must override, or error:
	// class MyClass1 inherits unrelated defaults for bar()
	// from types MyJ8Interface and MyJ8Interface1

	public static void main(String[] args) {
		DefaultMethodTest2 c = new DefaultMethodTest2();
		c.foo(); // run foo() in MyClass1
		c.foo1(); // run foo1() in MyClass1
		c.bar(); // Run default in MyClass1
	}
}
