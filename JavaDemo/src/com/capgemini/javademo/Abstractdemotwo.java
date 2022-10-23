//This programs demonstrates the use of constructors in abstract class
package com.capgemini.javademo;
abstract class Base
{
	Base()//constructor definition
	{
		System.out.println("Base Constructor Called");
	}
	abstract void functionOne();//abstract method
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived Constructor Called");
	}

	@Override
	void functionOne()//The abstract method is overridden
	{
		System.out.println("Derived functionOne() called");		
	}
	
}

public class Abstractdemotwo {

	public static void main(String[] args) {
		Derived obj = new Derived();//This will call both constructors

	}

}

 
