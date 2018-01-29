package asd.day11.lab13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author luatnguyen
 *
 */
public class ClientApp {
	public static void main(String[] args) {
		String tokenString = "- + 10 5 - 8 2";
		String[] arrayToken = tokenString.split(" ", -1);
		List<String> tokenList = new ArrayList<>(Arrays.asList(arrayToken));

		TokenReader tokenReader = new TokenReader();
		Expression expression = tokenReader.readToken(tokenList);
		System.out.println(expression.interpret());
	}
}
