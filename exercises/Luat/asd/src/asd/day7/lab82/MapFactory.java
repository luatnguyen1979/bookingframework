/**
 * 
 */
package asd.day7.lab82;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luatnguyen
 *
 */
public class MapFactory {
	private static final Map<String, IMap> maps = new HashMap<String, IMap>();

	public static GoogleMap getGoogleMap(String cityName) {
		GoogleMap map = (GoogleMap) maps.get(cityName);
		if (map == null) {
			map = new GoogleMap(cityName);
			maps.put(cityName, map);
		}
		return map;
	}
}
