/**
 * 
 */
package asd.day2.lab32;
import java.io.Serializable;
import java.util.Hashtable;

/**
 * @author luatnguyen
 *
 */
 class OrgHashTable extends Hashtable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int proxyNumber = 1;
    // Constructor
    public OrgHashTable() {
        super();
    }
    // Return a copy of current object with proxyNumber set back to 1.
    public synchronized Object clone() {
        OrgHashTable copy;
        copy = (OrgHashTable)super.clone();
        copy.proxyNumber = 1;
        return copy;
    }

    // Return the number of proxies.
    synchronized int getProxyNumber() {
        return proxyNumber;
    }
    // Increase the number of proxies
    synchronized void addProxy() {
        proxyNumber++;
    }
    // Decrease the number of proxies
    synchronized void removeProxy() {
        proxyNumber--;
    }
}

