/**
 * 
 */
package asd.day4.lab52.packagings;

import asd.day4.lab52.abstracts.AbstractBoxPackaging;

/**
 * @author luatnguyen
 *
 */
public class KidBox extends AbstractBoxPackaging {

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getCost()
	 */
	@Override
	public float getCost() {

		return 0.50f	;
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getPackagingTypeName()
	 */
	@Override
	public String getPackagingTypeName() {

		return "Cartoon";
	}

}
