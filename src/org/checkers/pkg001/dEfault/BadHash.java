package org.checkers.pkg001.dEfault;

//MUTABLE_HASHCODE Example

import java.util.HashMap;
import java.util.Map;

public class BadHash {

	private int mutable;

    public BadHash(int value) {
        mutable = value;
    }

    public static void main(String[] args) {
        BadHash bh = new BadHash(5);
        Map m = new HashMap();

        m.put(bh, 5);
        bh.mutable = 20;

        // We lost bh!
        assert(m.get(bh) != null);
    }

    public int hashCode() {
        return mutable;
    }
}
