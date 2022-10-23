//This program demonstrates Hierarchical Inheritance
package com.capgemini.javademo;

class Parent
{
	void displayOne()
	{
		System.out.println("One");
	}
}
class ChildOne extends Parent
{
	void displayTwo()
	{
		System.out.println("Two");
	}
}
class ChildTwo extends Parent
{
	void displayThree()
	{
		System.out.println("Three");
	}
}
class ChildThree extends Parent
{
	void displayFour()
	{
		System.out.println("Four");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		ChildThree objOne = new ChildThree();
		objOne.displayOne();
		objOne.displayFour();
		
		ChildTwo objTwo = new ChildTwo();
		objTwo.displayOne();
		objTwo.displayThree();
		
		ChildOne objThree = new ChildOne();
		objThree.displayOne();
		objThree.displayTwo();

	}

}

