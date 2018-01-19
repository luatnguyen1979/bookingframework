/**
 * 
 */
package asd.day4.lab52.abstracts;

/**
 * @author luatnguyen
 *
 */
public abstract class AbstractPackaging implements Packaging {
	@Override
	public String toString() {
		return "[Packaging type name: " + getPackagingTypeName() + ", Cost: " + getCost() + "]";
	}
}