package terminal.executable;

import terminal.CommandExecutable;
import zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {
    private Zoo zoo;


    public DeleteSnakeExecutable(Zoo zoo){
        this.zoo = zoo;
        zoo.remooveSnakeFromZoo();

    }


    @Override
    public void execut() {
        System.out.println("Змея удалена");
    }
}