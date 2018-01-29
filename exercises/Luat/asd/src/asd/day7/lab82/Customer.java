/**
 * 
 */
package asd.day7.lab82;

/**
 * @author luatnguyen
 *
 */
public class Customer implements ICustomer{
	private GoogleMap map;

	
	/**
	 * @param map
	 */
	public Customer(GoogleMap map) {
		this.map = map;
	}


	/* (non-Javadoc)
	 * @see asd.day7.lab82.ICustomer#createMap(long, long, java.lang.String)
	 */
	@Override
	public void createMap(long longitube, long latitube, GoogleMap map) {
		
		
	}

	/* (non-Javadoc)
	 * @see asd.day7.lab82.IMap#createMap()
	 */
//	@Override
//	public void createMap(long longitude, long latitube, String cityName) {
//		GoogleMap map = MapFactory.getGoogleMap(cityName);
//		locationMap = new Image(longitude)
//		MapFactory.getGoogleMap(cityName);
//		
//	}
	
}
