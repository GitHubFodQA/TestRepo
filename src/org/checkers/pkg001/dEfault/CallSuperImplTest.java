package org.checkers.pkg001.dEfault;

//CALL_SUPER Example

public class CallSuperImplTest {

	 @Override
	    protected Object clone() {
	        //missing super()
	        return null;
	    }
		
	    public void foo() {
	    }
		
	    class Foo {
	        protected Object clone() throws CloneNotSupportedException {
	            return super.clone();
	        }
	    }
		
	    class Bar {
	        protected Object clone() throws CloneNotSupportedException {
	            return super.clone();
	        } 
	    }
	 
	    class Apple extends CallSuperImplTest{
	        public void foo() {
	            super.foo();
	        }
	    }
		
	    class Banana extends CallSuperImplTest{
	        public void foo() {
	            super.foo();
	        }
	    }

	    class Cherry extends CallSuperImplTest{
	        public void foo() {
	            //missing super()
	            return;
	        }
	    }
}
