/**
 * 
 */
package asd.day4.lab52.factories;

import asd.day4.lab52.abstracts.AbstractBagPackaging;
import asd.day4.lab52.abstracts.AbstractBoxPackaging;
import asd.day4.lab52.abstracts.AbstractWrapPackaging;
import asd.day4.lab52.packagings.AdultBag;
import asd.day4.lab52.packagings.AdultBox;
import asd.day4.lab52.packagings.AdultWrap;

/**
 * @author luatnguyen
 *
 */
public class AdultPackagingFactory implements PackagingFactory {

	/* (non-Javadoc)
	 * @see asd.day4.lab52.factories.PackagingFactory#createBag()
	 */
	@Override
	public AbstractBagPackaging createBag() {
		// TODO Auto-generated method stub
		return new AdultBag();
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.factories.PackagingFactory#createBox()
	 */
	@Override
	public AbstractBoxPackaging createBox() {
		// TODO Auto-generated method stub
		return new AdultBox();
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.factories.PackagingFactory#createWrap()
	 */
	@Override
	public AbstractWrapPackaging createWrap() {
		// TODO Auto-generated method stub
		return new AdultWrap();
	}

}
