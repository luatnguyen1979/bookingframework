package usa.edu.mum.asd.labs.lab5.command;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        // Request receiver object
        Square square = new Square(13);
        // Creating command objects (concrete)
        Command createCommand = new CreateCommand(square, 5);
        Command moveCommand = new MoveCommand(square, 2);
        Command scaleCommand = new ScaleCommand(square, 2);
        List<Command> commandList = new LinkedList<>();
        commandList.add(createCommand);
        commandList.add(moveCommand);
        commandList.add(scaleCommand);
        // Invoker
        Invoker invoker = new Invoker(commandList);
        invoker.playSquare();
    }
}
