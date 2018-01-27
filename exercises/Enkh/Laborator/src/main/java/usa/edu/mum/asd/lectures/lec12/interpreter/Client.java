package usa.edu.mum.asd.lectures.lec12.interpreter;

import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        String roman = "MDCCCXIII";
        //Context holds a reference to the input Roman numeral and intermediate results
        Context context = new Context(roman);
        //Get the parse tree from Context
        List tree = context.getParseTree();
        for (Iterator it = tree.iterator(); it.hasNext(); ) {
            Expression exp = (Expression) it.next();
            System.out.println("Parsing with exp: " + exp);
            exp.interpret(context);
        }
        System.out.println("----------------------------------");
        System.out.println(roman + " = " + context.output);
    }
}