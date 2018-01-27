package usa.edu.mum.asd.lectures.lec12.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Context {

    List<Expression> tree = new ArrayList<Expression>();
    String input;
    int output;

    public Context() {
        // Build the 'parse tree'
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());
    }

    public Context(String input) {
        this();
        this.input = input;
    }

    public List<Expression> getParseTree() {
        return tree;
    }
}
