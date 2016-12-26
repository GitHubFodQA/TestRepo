package org.checkers.pkg001.preview;

//FORWARD_CLASSCAST Example

public class ForwardClasscastExample {

	public static class A {}
	public static class B extends A {}
	public static class C extends A {}

	public static void f(String[] args) {
	    A v = null;
	    if(args[0].equals("y")) {
	        v = new B();
	    } else {
	        v = new C();
	    }
	    B v2 = (B) v;
	}
}
