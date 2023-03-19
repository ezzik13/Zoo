package terminal;

import zoo.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class TerminalReader implements CommandParser {
    private CommandExecutableFactory commandExecutableFactory;
    public static TerminalReader terminalReader;
    private CommandParser commandParser;
    private Scanner scan;

    public TerminalReader(CommandExecutableFactory commandExecutableFactory) {
        this.commandExecutableFactory = commandExecutableFactory;
        this.scan = new Scanner(System.in);
    }



Menu com = new Menu();

    public void endless() {

        while (true) {
            com.printMenu();
            System.out.print("Введите команду: ");
            String input = scan.nextLine();
            if (input.equals("end")) break;
            Command newCom = this.parsCommand(input);


            CommandExecutable command = commandExecutableFactory.create(newCom);
            command.execut();
        }
        scan.close();
    }


    @Override
    public Command parsCommand(String inputCommand) {
        String[] commands = inputCommand.split(" ");
        Command command = new Command(commands[0], commands[1]);
        return command ;
    }
}
