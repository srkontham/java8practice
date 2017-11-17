package org.srk.practice.java8.staticMethod;

public class StaticMethodTest implements MyJ8StaticInterface {
	@Override
	public void foo2() {
		System.out.println("run foo2() in MyClass2");
	}

	public static void main(String[] args) {
		StaticMethodTest test = new StaticMethodTest();
		test.foo2(); // run foo2() in MyClass2
		MyJ8StaticInterface.bar2(); // run static in MyJ8Interface2
		// test.bar2(); // error: cannot find symbol: method bar2()
		// Interface static methods are not available to the instances!!!
	}
}
