/**
 * 
 */
package asd.day2.lab32;

import java.util.Hashtable;

/**
 * @author luatnguyen
 *
 */
public class LargeHashtable extends Hashtable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1789734761465819763L;
	// The OriginalHashTable that this is a proxy for.
    private OrgHashTable hashTable;

    public LargeHashtable() {
        hashTable = new OrgHashTable();
    }


    public int size() {
        return hashTable.size();
    }


    public synchronized Object get(Object key) {
        return hashTable.get(key);
    }

    public synchronized Object put(Object key, Object value) {
        copyOnWrite();
        return hashTable.put(key, value);
    }

    // Return a copy of the proxy.
    public synchronized Object clone() {
        Object copy = super.clone();
        hashTable.addProxy();
        return copy;
    }

    private void copyOnWrite() {
        if (hashTable.getProxyNumber() > 1) {
            synchronized (hashTable) {
                hashTable.removeProxy();
                try {
                    hashTable = (OrgHashTable)
                            hashTable.clone();
                } catch (Throwable e) {
                    hashTable.addProxy();
                }
            }
        }
    }
}
