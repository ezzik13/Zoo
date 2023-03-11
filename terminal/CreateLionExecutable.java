package terminal;

import zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo){
        this.zoo = zoo;

    }
    @Override
    public void execut() {
        System.out.println("Лев добавлен");
    }
}
