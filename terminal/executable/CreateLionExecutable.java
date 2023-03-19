package terminal.executable;

import terminal.CommandExecutable;
import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo){
        this.zoo = zoo;
        zoo.insertLionToZoo();
    }
    @Override
    public void execut() {
        System.out.println("Лев добавлен");
    }
}
