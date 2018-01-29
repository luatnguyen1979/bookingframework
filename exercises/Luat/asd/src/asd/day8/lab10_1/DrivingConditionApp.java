/**
 * 
 */
package asd.day8.lab10_1;

/**
 * @author luatnguyen
 *
 */
public class DrivingConditionApp {
	public static void main(String... agrs) {
		DrivingCondition driving = new DrivingCondition();
		driving.getEffectPressing();
		
		driving.changeWeatherCondition(WeatherCondition.Gravel);
		driving.getEffectPressing();

		driving.changeWeatherCondition(WeatherCondition.Wet);
		driving.getEffectPressing();
		
		driving.changeWeatherCondition(WeatherCondition.Ice);
		driving.getEffectPressing();
		
		driving.changeWeatherCondition(WeatherCondition.Regular);
		driving.getEffectPressing();
	}

}
