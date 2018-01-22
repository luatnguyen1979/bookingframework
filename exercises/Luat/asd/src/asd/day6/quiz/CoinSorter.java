/**
 * 
 */
package asd.day6.quiz;

import org.omg.CORBA.Request;

/**
 * @author luatnguyen
 *
 */
public abstract class CoinSorter {
	protected CoinSorter next;
	
	public abstract void sortCoins(Coin coin);
}
