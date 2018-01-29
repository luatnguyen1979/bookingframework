/**
 * 
 */
package asd.day8.lab10_1;

/**
 * @author luatnguyen
 *
 */
//Context
public class DrivingCondition {
	
	private ConditionState state;
	
	public DrivingCondition() {
		this.state = RegularCondition.instance();
	}
	
	public void changeWeatherCondition(WeatherCondition condition) {
		switch(condition) {
		case Wet:
			state = WetCondition.instance();
			break;
		case Gravel:
			state = GravelCondition.instance();
			break;
		case Ice:
			state = IceCondition.instance();
			break;
		case Regular:
		default:
			state = RegularCondition.instance();
		
		}
	}
	
	public void right() {
		state.right();
	}
	
	public void left() {
		state.left();
	}
	
	public void accel() {
		state.accel();
	}
	
	public void brake() {
		state.brake();
	}
	
	public void getEffectPressing() {
		right();
		accel();
		left();
		brake();
		System.out.println();
	}
}
