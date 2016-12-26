package org.checkers.pkg001.dEfault;

//FORWARD_NULL Example

public class ForwardNullExample {

	public static Object callA() {
        // this causes a FORWARD_NULL bug report
        return testA(null);
    }
    public static Object callB() {
        // no bug here
        return testA(new Object());
    }
    
    public static String testA(Object o) {
        return o.toString();
    }
    public static int testI(Object o)
    {
	return 0;
    }
}
