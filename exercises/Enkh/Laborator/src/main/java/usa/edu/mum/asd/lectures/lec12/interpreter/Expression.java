package usa.edu.mum.asd.lectures.lec12.interpreter;

public abstract class Expression {
    
    public void interpret(Context context) {
        if (context.input.length() == 0)
            return;
        if (context.input.startsWith(nine())) {
            context.output = context.output + (9 * multiplier());
            context.input = context.input.substring(2);
        } else if (context.input.startsWith(four())) {
            context.output = context.output + (4 * multiplier());
            context.input = context.input.substring(2);
        } else if (context.input.startsWith(five())) {
            context.output = context.output + (5 * multiplier());
            context.input = context.input.substring(1);
        }
        while (context.input.startsWith(one())) {
            context.output = context.output + (1 * multiplier());
            context.input = context.input.substring(1);
        }
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public abstract String one();

    public abstract String four();

    public abstract String five();

    public abstract String nine();

    public abstract int multiplier();
}
