package usa.edu.mum.asd.lectures.lec5.command;

public interface Command {

    public boolean execute(Person person);

    public boolean undo(Person person);
}