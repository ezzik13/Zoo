package terminal.executable;
import terminal.CommandExecutable;
import zoo.Zoo;
public class DeleteLionExecutable implements CommandExecutable {
    private Zoo zoo;


    public DeleteLionExecutable(Zoo zoo){
        this.zoo = zoo;
        zoo.remooveLionFromZoo();

    }


    @Override
    public void execut() {
        System.out.println("Лев удален");
    }
}
