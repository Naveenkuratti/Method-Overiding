package com;

public class Employee {
	void work() {
		System.out.println("Employee is working");
	}

}
class Developer extends Employee{
	@Override
	void work() {
		System.out.println("Developing the app");
	}
}
class Test extends Developer{
	@Override
	void work () {
		System.out.println("Testing the app");
	}
}