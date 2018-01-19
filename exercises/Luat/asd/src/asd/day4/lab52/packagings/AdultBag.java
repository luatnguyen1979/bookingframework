/**
 * 
 */
package asd.day4.lab52.packagings;

import asd.day4.lab52.abstracts.AbstractBagPackaging;

/**
 * @author luatnguyen
 *
 */
public class AdultBag extends AbstractBagPackaging {

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getCost()
	 */
	@Override
	public float getCost() {
		return 0.0f;
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getPackagingTypeName()
	 */
	@Override
	public String getPackagingTypeName() {
		return "Reusable Shopper";
	}

}
