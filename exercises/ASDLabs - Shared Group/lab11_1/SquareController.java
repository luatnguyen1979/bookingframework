package lab11_1;

import java.util.Stack;

public class SquareController {
	private Command runnningCommand = null;
	private Stack<Command> executedCommand = new Stack<Command>();

	public void setCommand(Command command) {
		runnningCommand = command;
	}

	public void execute() {
		runnningCommand.execute();
		executedCommand.push(runnningCommand);
	}

	public void undoCommand() {
		executedCommand.pop().undo();
	}
}
