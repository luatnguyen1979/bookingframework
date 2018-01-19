/**
 * 
 */
package asd.day4.lab52.factories;

import asd.day4.lab52.utils.AudianceType;

/**
 * @author luatnguyen
 *
 */
public class FactoryProducer {
	
	public final static PackagingFactory getPackageFactory(AudianceType type) {
		if (type == AudianceType.Business) {
			return new BusinessPackagingFactory();
		} else if (type == AudianceType.Adult) {
			return new AdultPackagingFactory();
		} else if (type == AudianceType.Kid) {
			return new KidPackagingFactory();
		}
		return null;
	}

}
