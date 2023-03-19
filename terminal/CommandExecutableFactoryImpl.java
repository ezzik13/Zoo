package terminal;

import terminal.executable.*;
import zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{

    private Zoo zoo;


    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command com) {
        CommandExecutable commandExecutable;

        if (com.isCreateLion()) commandExecutable = new CreateLionExecutable(zoo);
        else if (com.isDeleteLion()) commandExecutable = new DeleteLionExecutable(zoo);
        else if (com.isCreateWolfe()) commandExecutable = new CreateWolfeExecutable(zoo);
        else if (com.isDeleteWolfe()) commandExecutable = new DeleteWolfeExecutable(zoo);
        else if (com.isCreateSnake()) commandExecutable = new CreateSnakeExecutable(zoo);
        else if (com.isDeleteSnake()) commandExecutable = new DeleteSnakeExecutable(zoo);
        else  if(com.isPrint()) commandExecutable = new PrintZoo(zoo);
        else throw new RuntimeException("Команда не найдена");

        return commandExecutable;
    }
}
