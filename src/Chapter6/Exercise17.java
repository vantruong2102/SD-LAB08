package Chapter6;

public class Exercise17 {
	 public static void main(String[] args) {

	        Program3 program = new Program3();
	        CommandProcessor2 processor = new CommandProcessor2();

	        // Them Movie 1
	        UndoableCommand command1 = program.createAddCommand(
	                new Movie("Movie 1", 2000, 120),
	                Program3.Day.MONDAY
	        );

	        processor.consume(command1);

	        // Them Movie 2
	        UndoableCommand command2 = program.createAddCommand(
	                new Movie("Movie 2", 2010, 90),
	                Program3.Day.WEDNESDAY
	        );

	        processor.consume(command2);

	        System.out.println("Sau khi them 2 phim:");
	        System.out.println(program);

	        // Undo Movie 2
	        processor.undoLast();

	        System.out.println("Sau khi Undo:");
	        System.out.println(program);

	        // Redo Movie 2
	        processor.redoLast();

	        System.out.println("Sau khi Redo:");
	        System.out.println(program);

	        // Undo Movie 2
	        processor.undoLast();

	        // Undo Movie 1
	        processor.undoLast();

	        System.out.println("Sau khi Undo 2 lan:");
	        System.out.println(program);

	        // Redo Movie 1
	        processor.redoLast();

	        System.out.println("Sau khi Redo Movie 1:");
	        System.out.println(program);
	    }

}
