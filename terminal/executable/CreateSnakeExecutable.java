package terminal.executable;

import terminal.CommandExecutable;
import zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable{
    private Zoo zoo;

    public CreateSnakeExecutable(Zoo zoo){
        this.zoo = zoo;
        zoo.insertLSnakeToZoo();
    }
    @Override
    public void execut() {
        System.out.println("Змея добавлена");
    }
}


