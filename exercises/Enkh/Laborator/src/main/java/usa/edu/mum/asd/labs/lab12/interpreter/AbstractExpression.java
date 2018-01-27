package usa.edu.mum.asd.labs.lab12.interpreter;

public abstract class AbstractExpression {

    public abstract void interpret(Context context);

    public boolean isNonTerminalExpression(String sub) {
        if (sub.equals("+")
                || sub.equals("*")
                || sub.equals("/")
                || sub.equals("-")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTerminalExpression(String sub) {
        return !isNonTerminalExpression(sub);
    }

    public String getSubstring(Context context) {
        String sub = context.input;
        if (context.input.indexOf(context.sep) > 0)
            sub = context.input.substring(0, context.input.indexOf(context.sep));
        return sub;
    }
}
