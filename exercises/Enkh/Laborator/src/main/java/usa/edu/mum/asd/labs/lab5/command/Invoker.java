package usa.edu.mum.asd.labs.lab5.command;

import java.util.List;

public class Invoker {

    private List<Command> commandList;

    public Invoker(List<Command> commandList) {
        this.commandList = commandList;
    }

    public void playSquare() {
        Command last = null;
        while (!commandList.isEmpty()) {
            last = commandList.remove(0);
            last.execute();
            System.out.println("========================================");
        }
        last.undo();
    }
}
