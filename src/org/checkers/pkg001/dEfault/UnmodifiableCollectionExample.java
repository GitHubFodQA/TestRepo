package org.checkers.pkg001.dEfault;

//UNMODIFABLE_COLLECTION Example

public class UnmodifiableCollectionExample {

	public void callAdd() {
		   Object[] o = new Object[1]; 
		   java.util.List l = java.util.Arrays.asList(o); // EABL created 
		   l.add(new Object()); //unsupported operation
		}
	public void listIteratorTest() {
		   Object[] o = new Object[1];
		   java.util.List l = java.util.Arrays.asList(o); // EABL created 
		   java.util.ListIterator i = l.listIterator();
		   i.add(new Object());  //unsupported operation
		}
}
