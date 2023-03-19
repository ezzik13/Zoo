package terminal.executable;

import terminal.CommandExecutable;
import zoo.Zoo;

public class CreateWolfeExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateWolfeExecutable(Zoo zoo) {
        this.zoo = zoo;
        zoo.insertWolfToZoo();

    }

    @Override
    public void execut() {
        System.out.println("Волк добавлен");
    }
}
