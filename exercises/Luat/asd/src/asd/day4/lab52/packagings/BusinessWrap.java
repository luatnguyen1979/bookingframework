/**
 * 
 */
package asd.day4.lab52.packagings;

import asd.day4.lab52.abstracts.AbstractWrapPackaging;

/**
 * @author luatnguyen
 *
 */
public class BusinessWrap extends AbstractWrapPackaging {

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

		return "Holiday Surprise";
	}

}
