package org.checkers.pkg001.preview;

//ATOMICITY Example

public class AtomicityTest {

	class MyVector {
        private int size = 0;
        Object[] arr = new Object[10];

        public synchronized int size() {
            return size;
        }

        public synchronized Object get(int i) {
            return arr[i];
        }

        public synchronized void put(Object o) {
            if (size == arr.length) {
                Object[] newArr = new Object[arr.length * 2];
                System.arraycopy(arr, 0, newArr, 0, size);
                arr = newArr;
            }
	arr[size++] = o;
        }

        public synchronized Object removeLast() {
            Object ret = arr[--size];
            arr[size] = null;
            return ret;
        }
        
     MyVector v = new MyVector();

        public void unsafe(int size) {
                Object o = v.get(size);
                v.put(o); // Defect:  Use of variable inside another synchronized block
                o.toString();
        }
	}
}
