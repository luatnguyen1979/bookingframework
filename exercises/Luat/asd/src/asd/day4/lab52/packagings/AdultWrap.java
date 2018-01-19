/**
 * 
 */
package asd.day4.lab52.packagings;

import asd.day4.lab52.abstracts.AbstractWrapPackaging;

/**
 * @author luatnguyen
 *
 */
public class AdultWrap extends AbstractWrapPackaging {

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
		// TODO Auto-generated method stub
		return "Everyday Value";
	}

}
