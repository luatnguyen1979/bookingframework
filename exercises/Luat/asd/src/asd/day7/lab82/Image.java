package asd.day7.lab82;

public class Image implements IMap {
	private long longitude;
	private long latitude;
	private GoogleMap map;

	/**
	 * @param longitude
	 * @param latitude
	 * @param map
	 */
	public Image(long longitude, long latitude, GoogleMap map) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.map = map;
	}

	/**
	 * @return the longitude
	 */
	public long getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public long getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the map
	 */
	public GoogleMap getMap() {
		return map;
	}

	/**
	 * @param map
	 *            the map to set
	 */
	public void setMap(GoogleMap map) {
		this.map = map;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day7.lab82.IMap#createMap()
	 */
	@Override
	public void createMap() {
		map.createMap();
	}

	@Override
	public String toString() {
		return "[Image longitude=" + this.longitude + " latitude=" + this.latitude + " GoogleMap=" + this.map.toString()
				+ "]";
	}
}
