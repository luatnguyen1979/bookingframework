package asd.day11.lab13_2;

/**
 * 
 * @author luatnguyen
 *
 */

public class AddExpression implements Expression{

	private Expression leftExp;
	private Expression rightExp;
	
	public AddExpression(Expression leftExp, Expression rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}
	
	@Override
	public int interpret() {
		return leftExp.interpret() + rightExp.interpret();
	}
	
}
