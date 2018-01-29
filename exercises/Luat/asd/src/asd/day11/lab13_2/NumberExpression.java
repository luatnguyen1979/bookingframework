package asd.day11.lab13_2;

/**
 * 
 * @author luatnguyen
 *
 */

public class NumberExpression implements Expression {

	int number;

	public NumberExpression(int number) {
		this.number = number;
	}

	@Override
	public int interpret() {
		return number;
	}

}
