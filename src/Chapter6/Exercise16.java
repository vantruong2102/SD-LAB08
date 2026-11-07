package Chapter6;

public class Exercise16 {
	
	public static void main(String[] args) {

        Program3 program = new Program3();
        CommandProcessor processor = new CommandProcessor();

        // Thực hiện lệnh thêm Movie 1
        UndoableCommand command1 = program.createAddCommand(
                new Movie("Movie 1", 2000, 120),
                Program3.Day.MONDAY
        );

        processor.consume(command1);

        System.out.println("Sau khi them Movie 1:");
        System.out.println(program);

        // Thực hiện lệnh thêm Movie 2
        UndoableCommand command2 = program.createAddCommand(
                new Movie("Movie 2", 2010, 90),
                Program3.Day.WEDNESDAY
        );

        processor.consume(command2);

        System.out.println("Sau khi them Movie 2:");
        System.out.println(program);

        // Undo lệnh gần nhất (thêm Movie 2)
        processor.undoLast();

        System.out.println("Sau khi undo lenh gan nhat:");
        System.out.println(program);

        // Undo tiếp lệnh thêm Movie 1
        processor.undoLast();

        System.out.println("Sau khi undo lan 2:");
        System.out.println(program);
	}

}
