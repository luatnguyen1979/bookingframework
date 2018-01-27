package usa.edu.mum.asd.labs.lab12.interpreter;

public class NonTerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        String sub = getSubstring(context);
        if (sub.equals("+")
                || sub.equals("*")
                || sub.equals("/")
                || sub.equals("-")) {
            context.stack.push(sub);
            context.input = context.input.substring(sub.length() + context.sep.length());
        }
    }
}
