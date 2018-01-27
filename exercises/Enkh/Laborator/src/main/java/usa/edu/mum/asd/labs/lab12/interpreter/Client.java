package usa.edu.mum.asd.labs.lab12.interpreter;

public class Client {

    public static void main(String[] args) {
        String tokenString = "- + 10 5 - 8 2";
        Expression expression = new Expression(tokenString);
        System.out.println(expression.interpret()); // (10 + 5) - (8 - 2)= 9
    }
}
