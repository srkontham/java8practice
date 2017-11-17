package org.srk.practice.java8.lamda;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) { // Constructor
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return name + "(" + age + ")";
	}

	// To be used in testing Consumer
	public void sayHello() {
		System.out.println(name + " says hello");
	}
}
