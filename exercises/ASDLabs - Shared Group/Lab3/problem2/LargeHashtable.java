package com.asd.lab3.prob2;

import java.util.Hashtable;

// The proxy.
public class LargeHashtable extends Hashtable {
    // The OriginalHashTable that this is a proxy for.
    private OriginalHashTable theHashTable;

    public LargeHashtable() {
        theHashTable = new OriginalHashTable();
    }

    // Return the number of key-value pairs in this hashtable.
    public int size() {
        return theHashTable.size();
    }

    // Return the value associated with the specified key.
    public synchronized Object get(Object key) {
        return theHashTable.get(key);
    }

    // Add the given key-value pair to this Hashtable.
    public synchronized Object put(Object key, Object value) {
        copyOnWrite();
        return theHashTable.put(key, value);
    }

    // Return a copy of this proxy that accesses the same Hashtable.
    public synchronized Object clone() {
        Object copy = super.clone();
        theHashTable.addProxy();
        return copy;
    }

    // This method is called before modifying the underlying
    // Hashtable. If it is being shared then this method clones it.
    private void copyOnWrite() {
        if (theHashTable.getProxyCount() > 1) {
            synchronized (theHashTable) {
                theHashTable.removeProxy();
                try {
                    theHashTable = (OriginalHashTable)
                            theHashTable.clone();
                } catch (Throwable e) {
                    theHashTable.addProxy();
                }
            }
        }
    }
}
