/**
 * 
 */
package asd.day8.lab10_1;

/**
 * @author luatnguyen
 *
 */
public class RegularCondition implements ConditionState {

	private static ConditionState s_instance;

	private RegularCondition() {
	}

	public static ConditionState instance() {
		if (s_instance == null) {
			s_instance = new RegularCondition();
		}
		System.out.println("======Regular Condition======");
		return s_instance;
	}
	/* (non-Javadoc)
	 * @see asd.day8.lab10_1.ConditionState#left()
	 */
	@Override
	public void left() {
		 System.out.println("The left effect (in an arbitrary scale) of pressing a button is 5");
		
	}

	/* (non-Javadoc)
	 * @see asd.day8.lab10_1.ConditionState#right()
	 */
	@Override
	public void right() {
		System.out.println("The right effect (in an arbitrary scale) of pressing a button is 5");
		
	}

	/* (non-Javadoc)
	 * @see asd.day8.lab10_1.ConditionState#accel()
	 */
	@Override
	public void accel() {
		System.out.println("The accelling effect (in an arbitrary scale) of pressing a button is 9");
		
	}

	/* (non-Javadoc)
	 * @see asd.day8.lab10_1.ConditionState#brake()
	 */
	@Override
	public void brake() {
		System.out.println("The braking effect (in an arbitrary scale) of pressing a button is 8");
		
	}

}
