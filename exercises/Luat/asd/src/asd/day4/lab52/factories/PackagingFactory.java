/**
 * 
 */
package asd.day4.lab52.factories;

import asd.day4.lab52.abstracts.AbstractBagPackaging;
import asd.day4.lab52.abstracts.AbstractBoxPackaging;
import asd.day4.lab52.abstracts.AbstractWrapPackaging;

/**
 * @author luatnguyen
 *
 */
public interface PackagingFactory {
	
	public abstract AbstractBagPackaging createBag();
	
	public abstract AbstractBoxPackaging createBox();
	
	public abstract AbstractWrapPackaging createWrap();

}
