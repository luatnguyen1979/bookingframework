package usa.edu.mum.asd.labs.lab3.templatemethod;

public abstract class ALetterProcessor {

    public final void process(char[][] content) {
        SymmetryType type = defineType(content);
        char[][] letter = construct(content, type);
        print(letter);
    }

    public abstract SymmetryType defineType(char[][] content);

    public abstract char[][] construct(char[][] content, SymmetryType type);

    public abstract void print(char[][] content);
}
