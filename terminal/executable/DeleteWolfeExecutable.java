package terminal.executable;

import terminal.CommandExecutable;
import zoo.Zoo;

public class DeleteWolfeExecutable implements CommandExecutable {
    private Zoo zoo;


    public DeleteWolfeExecutable(Zoo zoo){
        this.zoo = zoo;
        zoo.remooveWolfeFromZoo();

    }


    @Override
    public void execut() {
        System.out.println("Волк удален");
    }
}