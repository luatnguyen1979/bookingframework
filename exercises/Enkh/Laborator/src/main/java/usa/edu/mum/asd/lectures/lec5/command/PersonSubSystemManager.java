package usa.edu.mum.asd.lectures.lec5.command;

import java.util.Stack;

/**
 * Invoker class that asks a command to carry out requests.
 */
public class PersonSubSystemManager {

    private Command currentCommand = null;
    private Stack<Command> commandsExecuted = new Stack<Command>();
    private Stack<Person> commandsParameter = new Stack<Person>();

    public void setCurrentCommand(Command currentCommand) {
        this.currentCommand = currentCommand;
    }

    public void saveParentAndChildren(Person parent) {
        // a below line is corrected by Eegii.
        //currentCommand = new SaveCommand(parent);

        //parent object saved in database
        if (currentCommand.execute(parent) == true) {
            commandsExecuted.push(currentCommand);
            commandsParameter.push(parent);
            if (!parent.getChildren().isEmpty()) {
                for (Person child : parent.getChildren()) {
                    if (currentCommand.execute(child) == true) {
                        commandsExecuted.push(currentCommand);
                        commandsParameter.push(child);
                    } else {
                        //undo all executed commands
                        while (!commandsExecuted.empty()) {
                            commandsExecuted.pop().undo(commandsParameter.pop());
                        }
                        System.out.println("operation failed!");
                        return;
                    }
                }
            }//both parent and children objects saved in database
            System.out.println("operation completed!");
        } else { //parent object not saved
            System.out.println("operation failed!");
        }
    }
}