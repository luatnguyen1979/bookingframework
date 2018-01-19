/**
 * 
 */
package asd.day4.lab52.factories;

import asd.day4.lab52.abstracts.AbstractBagPackaging;
import asd.day4.lab52.abstracts.AbstractBoxPackaging;
import asd.day4.lab52.abstracts.AbstractWrapPackaging;
import asd.day4.lab52.packagings.KidBag;
import asd.day4.lab52.packagings.KidBox;
import asd.day4.lab52.packagings.KidWrap;

/**
 * @author luatnguyen
 *
 */
public class KidPackagingFactory implements PackagingFactory {

	/* (non-Javadoc)
	 * @see asd.day4.lab52.factories.PackagingFactory#createBag()
	 */
	@Override
	public AbstractBagPackaging createBag() {
		// TODO Auto-generated method stub
		return new KidBag();
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.factories.PackagingFactory#createBox()
	 */
	@Override
	public AbstractBoxPackaging createBox() {
		// TODO Auto-generated method stub
		return new KidBox();
	}

	/* (non-Javadoc)
	 * @see asd.day4.lab52.factories.PackagingFactory#createWrap()
	 */
	@Override
	public AbstractWrapPackaging createWrap() {
		// TODO Auto-generated method stub
		return new KidWrap();
	}

}
