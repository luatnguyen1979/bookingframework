package usa.edu.mum.asd.labs.lab12.interpreter;

import java.util.Stack;

public class Context {

    public String input;
    public Stack<String> stack;
    public String sep;

    public Context(String input, String sep) {
        this.input = input;
        this.stack = new Stack();
        this.sep = sep;
    }
}
