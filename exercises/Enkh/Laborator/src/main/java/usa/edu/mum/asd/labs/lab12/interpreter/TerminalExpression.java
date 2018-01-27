package usa.edu.mum.asd.labs.lab12.interpreter;

public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        String sub = getSubstring(context);
        if (isTerminalExpression(sub)) {
            String prev = context.stack.pop();
            if (isNonTerminalExpression(prev)) {
                context.stack.push(prev);
                context.stack.push(sub);
                context.input = context.input.substring(sub.length() + context.sep.length());
            } else {
                int first = Integer.parseInt(prev);
                int second = Integer.parseInt(sub);
                String operator = context.stack.pop();
                if (operator.equals("+")) {
                    context.stack.push(String.valueOf(first + second));
                } else if (operator.equals("*")) {
                    context.stack.push(String.valueOf(first * second));
                } else if (operator.equals("/")) {
                    context.stack.push(String.valueOf(first / second));
                } else if (operator.equals("-")) {
                    context.stack.push(String.valueOf(first - second));
                }
                if (context.input.length() >= 1 + context.sep.length()) {
                    context.input = context.input.substring(sub.length() + context.sep.length());
                } else {
                    context.input = context.input.substring(sub.length());
                }
            }
            if (context.input.length() == 0 && context.stack.size() > 1) {
                context.input = context.stack.pop();
            }
        }
    }
}
