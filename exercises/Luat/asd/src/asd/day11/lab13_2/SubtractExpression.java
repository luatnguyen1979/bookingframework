package asd.day11.lab13_2;

//nonterminal expression, contains left and right expressions below it
/**
 * 
 * @author luatnguyen
 *
 */
public class SubtractExpression implements Expression {

	private Expression leftExp;
	private Expression rightExp;

	public SubtractExpression(Expression leftExp, Expression rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	@Override
	public int interpret() {
		return leftExp.interpret() - rightExp.interpret();
	}

}
