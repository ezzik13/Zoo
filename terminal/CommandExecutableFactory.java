package terminal;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import zoo.Zoo;

public class CommandExecutableFactory {
    private static String[] expectedCommands;
    private Zoo zoo;

    static {
        expectedCommands = new String[]{"Удалить", "Создать"};
    }

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(String[] input) {
        String des = "";
        for (String expectedCommand : expectedCommands) {
            for (String s : input) {
                if (expectedCommand.equals(s)) {
                    des = s;
                }
            }
        }
        if (des.isEmpty()){
            throw new RuntimeException("Команда не найдена");
        }
        CommandExecutable commandExecutable;
        if (des.equals("Удалить")) {
            commandExecutable = new DeleteLionExecutable(zoo);
        } else {
            commandExecutable = new CreateLionExecutable(zoo);
        }
        return commandExecutable;
    }
}
