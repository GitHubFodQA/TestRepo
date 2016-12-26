package org.checkers.pkg001.dEfault;

//BAD_OVERRIDE Example

public class BadOverrideExample {

	void f(B obj) { int average = obj.getAaverage(3); }
	
	public class A {
		
		int getAAverage(int a) 
		{
			return 0;
		}
	}
	
	public class B extends A {

		int getAaverage(int b) 
		{
			return 0;
		}
	}
}
