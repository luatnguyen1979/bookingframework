package asd.day8.lab10_1;

public class GravelCondition implements ConditionState {

	private static ConditionState s_instance;

	private GravelCondition() {
	}

	public static ConditionState instance() {
		if (s_instance == null) {
			s_instance = new GravelCondition();
		}
		System.out.println("======Gravel Condition======");
		return s_instance;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day8.lab10_1.ConditionState#left()
	 */
	@Override
	public void left() {
		System.out.println("The left effect (in an arbitrary scale) of pressing a button is 3");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day8.lab10_1.ConditionState#right()
	 */
	@Override
	public void right() {
		System.out.println("The right effect (in an arbitrary scale) of pressing a button is 3");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day8.lab10_1.ConditionState#accel()
	 */
	@Override
	public void accel() {
		System.out.println("The accelling effect (in an arbitrary scale) of pressing a button is 7");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asd.day8.lab10_1.ConditionState#brake()
	 */
	@Override
	public void brake() {
		System.out.println("The braking effect (in an arbitrary scale) of pressing a button is 6");

	}
}
