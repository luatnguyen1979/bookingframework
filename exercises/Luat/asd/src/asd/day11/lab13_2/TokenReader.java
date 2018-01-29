package asd.day11.lab13_2;

import java.util.List;

/**
 * 
 * @author luatnguyen
 *
 */
public class TokenReader {

	public Expression readToken(List<String> tokenList) {
		Expression expression = readNextToken(tokenList);
		return expression;
	}

	private Expression readNextToken(List<String> tokenList) {
		if (tokenList.get(0).matches("\\d+")) {
			int number = Integer.parseInt(tokenList.get(0));
			tokenList.remove(0); 
			return new NumberExpression(number);
		} else {
			return ReadNonTerminal(tokenList);
		}
	}

	private Expression ReadNonTerminal(List<String> tokenList) {
		String operator = tokenList.get(0);
		tokenList.remove(0);
		Expression leftExp = readNextToken(tokenList);
		Expression rightExp = readNextToken(tokenList);

		if (operator.equals("+")) {
			return new AddExpression(leftExp, rightExp);
		} else if (operator.equals("-")) {
			return new SubtractExpression(leftExp, rightExp);
		}
		return null;
	}
}
