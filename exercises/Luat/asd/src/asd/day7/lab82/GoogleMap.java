/**
 * 
 */
package asd.day7.lab82;

/**
 * @author luatnguyen
 *
 */
public class GoogleMap {
	private String cityName;

	/**
	 * @param cityName
	 */
	public GoogleMap(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName
	 *            the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/* (non-Javadoc)
	 * @see asd.day7.lab82.IMap#createMap(long, long, java.lang.String)
	 */
//	@Override
//	public void createMap(long longitube, long latitube, String cityName) {
//		System.out.println("Creating Google object for city: " + this.cityName);
//		
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab82.IMap#createMap()
	 */


	// @Override
	// public String toString() {
	// return "[GoogleMap cityName=" + this.cityName + "]";
	// }

}
