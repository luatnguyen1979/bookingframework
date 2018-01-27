package usa.edu.mum.asd.labs.lab12.interpreter;

import java.util.LinkedList;
import java.util.List;

public class Expression {

    private Context context;

    public Expression(String token) {
        this.context = new Context(token, " ");
    }

    public String interpret() {
        List<AbstractExpression> abstractExpressionList = new LinkedList<>();
        abstractExpressionList.add(new NonTerminalExpression());
        abstractExpressionList.add(new TerminalExpression());
        while (context.input.length() > 0) {
            for (AbstractExpression ae : abstractExpressionList) {
                ae.interpret(context);
            }
        }
        return context.stack.pop();
    }
}
