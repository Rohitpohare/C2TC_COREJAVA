//This program demonstrates single inheritance
package com.capgemini.javademo;

//Parent class definition
class ParentDemo{
	void displayOne()
	{
		System.out.println("One");
	}
}
//Child class definition 
class ChildDemo extends ParentDemo //extends keyword is used to inherit the parent class
{
	void displayTwo()
	{
		System.out.println("Two");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		ChildDemo obj  = new ChildDemo();
		obj.displayOne();
		obj.displayTwo();

	}

}
