/**
 * 
 */
package asd.day4.lab52.packagings;

import asd.day4.lab52.abstracts.AbstractBoxPackaging;

/**
 * @author luatnguyen
 *
 */
public class BusinessBox extends AbstractBoxPackaging {

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getCost()
	 */
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 1.0f;
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.abstracts.Packaging#getPackagingTypeName()
	 */
	@Override
	public String getPackagingTypeName() {
		// TODO Auto-generated method stub
		return "Hard Plastic";
	}

}
