/**
 * 
 */
package asd.day4.lab52.packagings;

import asd.day4.lab52.abstracts.AbstractBagPackaging;

/**
 * @author luatnguyen
 *
 */
public class BusinessBag extends AbstractBagPackaging {

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getCost()
	 */
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0.50f;
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getPackagingTypeName()
	 */
	@Override
	public String getPackagingTypeName() {
		// TODO Auto-generated method stub
		return "Merchant Collection";
	}
	
}
