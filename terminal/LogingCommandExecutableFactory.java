package terminal;

import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {


    public LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }

    @Override
    public CommandExecutable create(Command com) {
        System.out.println("Начато");
        CommandExecutable commandExecutable = super.create(com);
        System.out.println("Сделано");
        return commandExecutable;
    }
}
