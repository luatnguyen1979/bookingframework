package usa.edu.mum.asd.lectures.lec5.command;

/**
 * Concrete command that implements the Command interface.
 */
public class SaveCommand implements Command {

    private Database db;

    public SaveCommand(Database db) {
        this.db = db;
    }

    @Override
    public boolean execute(Person person) {
        return db.save(person);
    }

    @Override
    public boolean undo(Person person) {
        return db.remove(person);
    }
}