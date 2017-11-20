package org.srk.practice.java8.staticMethod;

class A {
	public static void foo() {
		System.out.println("foo() in class A");
	}

	public static void bar() {
		System.out.println("bar() in class A");
	}
}

class B extends A {
	// @Override // error: method does not override or implement a method from a
	// supertype
	// Not "override" but "hide" the superclass method.
	public static void foo() {
		System.out.println("foo() in class B");
	}
}

public class TestStaticMethodInheritance {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Invoke static method from classes
		A.foo(); // foo() in class A
		B.foo(); // foo() in class B
		A.bar(); // bar() in class A
		B.bar(); // bar() in class B (static methods are "inherited")

		// Invoke static method From instances
		A a = new A();
		a.foo(); // foo() in class A
		a.bar(); // bar() in class A
		B b = new B();
		b.foo(); // foo() in class B
		b.bar(); // bar() in class A ("inherited")

		// Test Polymorphism
		A a1 = new B();
		a1.foo(); // foo() in class A (non-polymorphic)
					// a1 is a reference of class A,
					// hence, class A's version is invoked.
	}
}
