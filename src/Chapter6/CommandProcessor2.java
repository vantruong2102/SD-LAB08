package Chapter6;

import java.util.ArrayList;
import java.util.List;

public class CommandProcessor2 {
	
	private final List<UndoableCommand> aExecutedCommands = new ArrayList<>();
	private final List<UndoableCommand> aUndoneCommands = new ArrayList<>();

	public void consume(UndoableCommand pCommand) {
		pCommand.execute();
		aExecutedCommands.add(pCommand);
	}

	public void undoLast() {
		assert !aExecutedCommands.isEmpty();
		UndoableCommand command = aExecutedCommands.removeLast();
		command.undo();
		aUndoneCommands.add(command);
	}

	public void redoLast() {
		assert !aUndoneCommands.isEmpty();
		UndoableCommand command = aUndoneCommands.removeLast();
		consume(command);
	}

}
