/**
 * 
 */
package asd.day4.lab52.packagings;

import asd.day4.lab52.abstracts.AbstractBoxPackaging;

/**
 * @author luatnguyen
 *
 */
public class AdultBox extends AbstractBoxPackaging {

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getCost()
	 */
	@Override
	public float getCost() {

		return 0.25f;
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getPackagingTypeName()
	 */
	@Override
	public String getPackagingTypeName() {

		return "Plain Paper";
	}

}
