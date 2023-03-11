package terminal;

import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader implements CommandParser {
    private CommandExecutableFactory commandExecutableFactory;
    //        public static TerminalReader terminalReader;
//    private CommandParser commandParser;
    private Scanner scan;
    //    private TerminalReader(CommandParser commandParser) {
//        this.commandParser = commandParser;
//    }

    public TerminalReader(CommandExecutableFactory commandExecutableFactory) {
        this.commandExecutableFactory = commandExecutableFactory;
        this.scan = new Scanner(System.in);
    }


//    public static TerminalReader newTerminalReader(CommandParser commandParser) {
//        if (terminalReader == null){
//            terminalReader = new TerminalReader(commandParser);
//        }
//        return terminalReader;
//    }


    public void endless() {

        while (true) {
            System.out.println("Применимые команды:");
            System.out.println("    Удалить");
            System.out.println("    Создать");
            System.out.print("Введите команду: ");
            String input = scan.nextLine();
            if (input.equals("end")) break;
            String[] parsingCommand = parsCommand(input);
            CommandExecutable command = commandExecutableFactory.create(parsingCommand);
            command.execut();
        }
        scan.close();
    }


    @Override
    public String[] parsCommand(String inputCommand) {
        return inputCommand.split(" ");
    }
}
